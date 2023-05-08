package classes;

import java.util.Scanner;

public class EstadoDisponivel implements Estado{

    private int quantidade;

    public setQuantidade(int qtd){
        this.quantidade = qtd;
    }

    @Override
    public int quantidade() {
        return this.quantidade;
    }

    @Override
    public void trocaEstado(Produtos p) {

        if(quantidade <= 50){
            p.setStatus();//EstadoPoucasUnidades
        }else if(quantidade == 0){
            p.setStatus();//EstadoSemEstoque
        }
    }
}