package classes;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class GerenciamentoMovimentacao {
    List<Movimentacao> movimentacao = new ArrayList<>();

    public void adicionarMovimentacao(Movimentacao cp) {
        movimentacao.add(cp);
    }

    public void imprimirMovimentacao() {
        movimentacao.forEach((m) -> {
            System.out.println("********RELATÓRIO DA MOVIMENTAÇÃO:********");
            System.out.println("Identificação da Movimentação: " + m.getId());
            System.out.println("Data da Movimentação: " + m.getDataMovimentacao());
            System.out.println("Produto: " + m.getIdProduto());
            System.out.println("Categoria do Produto: " +  m.getCategoriaString(m.getTipoProduto()));
            System.out.println("Origem da Movimentação: " + m.getOrigem());
            System.out.println("Destino da Movimentação: " + m.getDestino());
            System.out.println("ID do Responsavel da Movimentação: " + m.getIdResponsavel());
            System.out.println("******************************************");
        });
    }

    public void editarMovimentacao() {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número do ID a ser localizado: ");
        int busca;
        busca = input.nextInt();
        input.nextLine();

        int i, achou=-1;
        System.out.println();

        for(i = 0; i < movimentacao.size(); i++)
        {
            int idteste = movimentacao.get(i).getId();
            if (idteste == busca) {
                movimentacao.get(i).editar();
                achou=1;
                break;
            }
        }

        if (achou==-1){
            System.out.println("ID da Movimentação não encontrada! Tente novamente");
            System.out.println();
        }
    }
}