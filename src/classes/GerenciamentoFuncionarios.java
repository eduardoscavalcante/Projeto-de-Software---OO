package classes;

import java.util.List;
import java.util.Scanner;

import javafx.scene.control.Alert;

import java.util.ArrayList;

public class GerenciamentoFuncionarios {
	List<Funcionarios> funcionarios = new ArrayList<>();

	public void imprimirFuncionarios() {
		funcionarios.forEach((f) -> {
			f.imprimir();
		});
	}

	public int buscaId(int id){
		int busca = id;
		int i;
		System.out.println();

		for(i = 0; i < funcionarios.size(); i++)
		{
			int idteste = funcionarios.get(i).getId();
			if (idteste == busca) {
				return i;
			}
		}
		return (-1);
	}

	public void editarFuncionarios() {
		// int indice = buscaId();
		// if (indice == -1){
		// 	System.out.println("ID de produto não encontrado! Tente novamente");
		// 	System.out.println();
		// }else {
		// 	try {
		// 		funcionarios.get(indice).editar();
		// 	}catch(Exception e){
		// 		System.out.println("Ocorreu um Erro na Leitura de 1 ou + Dados!");
		// 	}
		// }
	}

	public void removerfuncionarios(int id) {
		int indice = buscaId(id);
		if (indice == -1){
			System.out.println("ID de produto não encontrado! Tente novamente");
			System.out.println();
		}else {
			funcionarios.remove(indice);
			System.out.println("Produto removido com sucesso!");
			System.out.println();
		}
	}
	
	//CORREÇÃO ID
	public boolean correcaoId(int Id) {

		int busca, i;
		busca = Id;
		boolean idExistente = false;

		if(funcionarios.size() > 0){
			for (i = 0; i < funcionarios.size(); i++) {
				int idteste = funcionarios.get(i).getId();
				if (idteste == busca) {
					Alert alert = new Alert(Alert.AlertType.ERROR);
					alert.setTitle("Funcionarios");
					alert.setHeaderText("Funcionario não Adicionado!");
					alert.setContentText("ID Do Funcionario Já Existente!");
					alert.show();
					idExistente = true;
					break;
				}
			}
		}
		return idExistente;
	}

	public static boolean idExistente;
	public void setCorrecaoId(boolean idExistente){
		GerenciamentoFuncionarios.idExistente = idExistente; 
	}

	public static boolean getCorrecaoId(){
		return idExistente; 
	}


	public void M_Inicial() {// função de apoio
		System.out.println("Qual o cargo do funcionário a ser adicionado?");
		System.out.println("*  [1] Vendedor                       *");
		System.out.println("*  [2] Gerente                        *");
	}

	public void gerenciamentoCargo(int identificação, long cpf, long telefone, int supOrMeta, String nome, String email, int aux) throws Exception{
		
		int flag = 0;
		boolean idExistente;

		while (flag != 1){

			switch(aux){
				case 1:
					Funcionarios v = new Vendedor(identificação, nome, email, telefone, cpf, aux, supOrMeta);
					idExistente = correcaoId(identificação);
					setCorrecaoId(idExistente);
					if (idExistente == false){
						funcionarios.add(v);
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("Gerenciamento de Funcionarios");
						alert.setHeaderText("VENDEDOR ADICIONADO!");
						alert.show();
					}
					flag = 1;
					break;
				case 2:
					Funcionarios g = new Gerente(identificação, nome, email, telefone, cpf, aux, supOrMeta);
					idExistente = correcaoId(identificação);
					setCorrecaoId(idExistente);
					if(idExistente == false) {
						funcionarios.add(g);
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("Gerenciamento de Funcionarios");
						alert.setHeaderText("GERENTE ADICIONADO!");
						alert.show();
					}
					flag = 1;
					break;
			}
		}
	}
}
