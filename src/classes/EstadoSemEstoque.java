package classes;

import java.util.Scanner;

public class EstadoSemEstoque implements Estado{

    private int quantidade;

    public setQuantidade(int qtd){
        this.quantidade = qtd;
    }

    @Override
    public int quantidade() {
        return 0;
    }

    @Override
    public void trocaEstado(Produtos p) {

        if(quantidade > 50){
            p.setStatus();//EstadoDisponivel
        }else{
            p.setStatus();//EstadoPoucasUnidades
        }
    }
}