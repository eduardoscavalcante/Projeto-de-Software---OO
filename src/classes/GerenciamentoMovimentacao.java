package classes;

import java.util.List;
import java.util.Scanner;

import javafx.scene.control.Alert;

import java.util.ArrayList;

public class GerenciamentoMovimentacao {
	List<Movimentacao> movimentacao = new ArrayList<>();

	public void adicionarMovimentacao(Movimentacao cp) {
		movimentacao.add(cp);
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Movimentações");
        alert.setHeaderText("MOVIMENTAÇÃO ADICIONADA!");
        alert.show();
	}

	public void imprimirMovimentacao() {
		movimentacao.forEach((m) -> {
			System.out.println("********RELATÓRIO DA MOVIMENTAÇÃO:********");
			System.out.println("Identificação da Movimentação: " + m.getId());
			System.out.println("Data da Movimentação: " + m.getDataMovimentacao());
			System.out.println("Produto: " + m.getIdProduto());
			//System.out.println("Categoria do Produto: " +  m.getTipoProduto());
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
				try{
					movimentacao.get(i).editar();
				}catch(Exception e){
					System.out.println("Ocorreu um Erro na Leitura de 1 ou + Dados!");
				}
				achou=1;
				break;
			}
		}

		if (achou==-1){
			System.out.println("ID da Movimentação não encontrada! Tente novamente");
			System.out.println();
		}
	}
	//CORREÇÃO ID
	public Movimentacao correcaoId(Movimentacao m) {

		Scanner input = new Scanner(System.in);

		int busca;
		busca = m.getId();

		int i, aux1;

		boolean idExistente = false;

		if(movimentacao.size() > 0){
			for (i = 0; i < movimentacao.size(); i++) {
				int idteste = movimentacao.get(i).getId();
				if (idteste == busca) {
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("Movimentação");
					alert.setHeaderText("ID Ja Existente!! \nMovimentação não adicionada!");
					alert.show();
					idExistente = true;
					// System.out.println("ID Ja Existente!!");
					// System.out.println("Digite Novamente");
					// System.out.println("Informe o código de identificação da Movimentação: ");
					// aux1 = input.nextInt();
					// //input.nextLine();
					// m.setId(aux1);
					// correcaoId(m);
					// break;
				}
			}
		}
		return m;
	}
	public boolean correcaoId2(int Id){
		int i;
		boolean idExistente = false;
		if(movimentacao.size() > 0){
			for (i = 0; i < movimentacao.size(); i++) {
				int idteste = movimentacao.get(i).getId();
				if (idteste == Id) {
					Alert alert = new Alert(Alert.AlertType.ERROR);
					alert.setTitle("Movimentação");
					alert.setHeaderText("Movimentação não Adicionada!");
					alert.setContentText("ID Da Movimentação Já Existente!");
					alert.show();
					idExistente = true;
				}
			}
		}
		return idExistente;
	}
}
