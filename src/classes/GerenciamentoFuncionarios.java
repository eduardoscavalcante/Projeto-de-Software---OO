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

	public int buscaId(){
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o número do ID a ser localizado: ");
		int busca;
		busca = input.nextInt();

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
		int indice = buscaId();
		if (indice == -1){
			System.out.println("ID de produto não encontrado! Tente novamente");
			System.out.println();
		}else {
			try {
				funcionarios.get(indice).editar();
			}catch(Exception e){
				System.out.println("Ocorreu um Erro na Leitura de 1 ou + Dados!");
			}
		}
	}

	public void removerfuncionarios() {
		int indice = buscaId();
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
					alert.setTitle("Gerente");
					alert.setHeaderText("Gerente não Adicionado!");
					alert.setContentText("ID Do Gerente Já Existente!");
					alert.show();
					idExistente = true;
					//aux1 = input.nextInt();
					//input.nextLine();
					//f.setId(aux1);
					//correcaoId(f);
					break;
				}
			}
		}
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
					if (idExistente == false){
						funcionarios.add(v);
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("Gerenciamento de Produtos");
						alert.setHeaderText("GERENTE ADICIONADO!");
						alert.show();
					}
					flag = 1;
				case 2:
					Funcionarios g = new Gerente(identificação, nome, email, telefone, cpf, aux, supOrMeta);
					idExistente = correcaoId(identificação);
					if(idExistente == false) {
						funcionarios.add(g);
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("Gerenciamento de Produtos");
						alert.setHeaderText("GERENTE ADICIONADO!");
						alert.show();
					}
					flag = 1;
			}
		}

		// Scanner input = new Scanner(System.in);

		// int flag = 0;

		// int cargo = -1;
		// String nome;
		// long cpf;
		// int id;
		// String email;
		// long telefone;
		// int mVendas;
		// int pSuperv;

		// while (flag != 1) {
		// M_Inicial();
		// 	cargo = input.nextInt();
		// 	input.nextLine();
		// 	switch(cargo){
		// 		case 1:
		// 			System.out.println("Informe o código de identificação do vendedor: ");
		// 			id = input.nextInt();
		// 			input.nextLine();
		// 			System.out.println("Informe o Nome Completo: ");
		// 			nome = input.nextLine();
		// 			System.out.println("Informe o Email: ");
		// 			email = input.nextLine();
		// 			System.out.println("Informe o Telefone(somente numeros): ");
		// 			telefone = input.nextLong();
		// 			input.nextLine();
		// 			System.out.println("Informe o CPF: ");
		// 			cpf = input.nextLong();
		// 			input.nextLine();
		// 			System.out.println("Informe a Meta Mensal das Vendas: ");
		// 			mVendas = input.nextInt();
		// 			input.nextLine();
		// 			System.out.println();

		// 			Funcionarios v = new Vendedor(id, nome, email, telefone, cpf, cargo, mVendas);
		// 			correcaoId(v);
		// 			funcionarios.add(v);

		// 			System.out.println("Vendedor "+ nome +" cadastrado com sucesso!");
		// 			flag = 1;
		// 			break;
		// 		case 2:
		// 			System.out.println("Informe o código de identificação do gerente: ");
		// 			id = input.nextInt();
		// 			input.nextLine();
		// 			System.out.println("Informe o Nome Completo: ");
		// 			nome = input.nextLine();
		// 			System.out.println("Informe o Email: ");
		// 			email = input.nextLine();
		// 			System.out.println("Informe o Telefone(somente numeros): ");
		// 			telefone = input.nextLong();
		// 			input.nextLine();
		// 			System.out.println("Informe o CPF: ");
		// 			cpf = input.nextLong();
		// 			input.nextLine();
		// 			System.out.println("Informe a Quantidade de Pessoas Supervisionadas: ");
		// 			pSuperv = input.nextInt();
		// 			input.nextLine();
		// 			System.out.println();

		// 			Funcionarios g = new Gerente(id, nome, email, telefone, cpf, cargo, pSuperv);
		// 			correcaoId(g);
		// 			funcionarios.add(g);

		// 			System.out.println("Gerente "+ nome +" cadastrado com sucesso!");
		// 			flag = 1;
		// 			break;
		// 		default:
		// 			System.out.println("Opção Invalida!!!");
		// 			System.out.println("Digite Novamente");
		// 			System.out.println();
		// 	}
		// }
	}
}
