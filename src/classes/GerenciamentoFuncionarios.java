package classes;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class GerenciamentoFuncionarios {
	List<Funcionarios> funcionarios = new ArrayList<>();

	public String getCargoString(int cargo){// função de apoio
		if (cargo == 1) {
			return "Vendedor";
		} else if (cargo == 2) {
			return "Gerente";
		} else {
			return "Cargo Invalido!!";
		}
	}

	public void imprimirFuncionarios() {
		funcionarios.forEach((f) -> {
			System.out.println("********RELATÓRIO DO FUNCIONÁRIO:*********");
			System.out.println("Identificação: " + f.getId());
			System.out.println("Nome: " + f.getNome());
			System.out.println("Email: " + f.getEmail());
			System.out.println("Telefone: " + f.getTelefone());
			System.out.println("CPF: " + f.getCPF());
			System.out.println("Cargo: " + getCargoString(f.getCargo()));
			if (f.getCargo() == 1) {
				System.out.println("Quantidade de vendas: " + f.getQnt());
			}
			else if (f.getCargo() == 2) {
				System.out.println("Quantidade de horas: " + f.getQnt());
			}
			System.out.println("******************************************");
		});
	}

	public void editarFuncionarios() {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o número do ID a ser localizado: ");
		int busca;
		busca = input.nextInt();
		input.nextLine();

		int i, achou=-1;
		System.out.println();

		for(i = 0; i < funcionarios.size(); i++)
		{
			int idteste = funcionarios.get(i).getId();
			if (idteste == busca) {
				funcionarios.get(i).editar();
				achou=1;
				break;
			}
		}

		if (achou==-1){
			System.out.println("ID do funcionario não encontrado! Tente novamente");
			System.out.println();
		}
	}

	public void removerfuncionarios() {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o número do ID do funcionario a ser removido: ");
		int busca;
		busca = input.nextInt();
		input.nextLine();

		int i, achou=-1;
		System.out.println();

		for(i = 0; i < funcionarios.size(); i++)
		{
			int idteste = funcionarios.get(i).getId();
			if (idteste == busca) {
				funcionarios.remove(i);
				System.out.println("Funcionario removido com sucesso!");
				System.out.println();
				achou=1;
				break;
			}
		}

		if (achou==-1){
			System.out.println("ID do funcionario não encontrado! Tente novamente");
			System.out.println();
		}
	}
	//CORREÇÃO ID
	public Funcionarios correcaoId(Funcionarios f) {

		Scanner input = new Scanner(System.in);

		int busca;
		busca = f.getId();

		int i, aux1;

		if(funcionarios.size() > 0){
			for (i = 0; i < funcionarios.size(); i++) {
				int idteste = funcionarios.get(i).getId();
				if (idteste == busca) {
					System.out.println("ID Ja Existente!!");
					System.out.println("Digite Novamente");
					System.out.println("Informe o código de identificação do funcionario: ");
					aux1 = input.nextInt();
					input.nextLine();
					f.setId(aux1);
					correcaoId(f);
					break;
				}
			}
		}
		return f;
	}

	public void M_Inicial() {// função de apoio
		System.out.println("Qual o cargo do funcionário a ser adicionado?");
		System.out.println("*  [1] Vendedor                       *");
		System.out.println("*  [2] Gerente                        *");
	}

	public void gerenciamentoCargo() {

		Scanner input = new Scanner(System.in);

		int flag = 0;

		int cargo = -1;
		String nome;
		long cpf;
		int id;
		String email;
		long telefone;
		int mVendas;
		int pSuperv;

		while (flag != 1) {
			M_Inicial();
			cargo = input.nextInt();
			input.nextLine();
			switch(cargo){
				case 1:
					System.out.println("Informe o código de identificação do vendedor: ");
					id = input.nextInt();
					input.nextLine();
					System.out.println("Informe o Nome Completo: ");
					nome = input.nextLine();
					System.out.println("Informe o Email: ");
					email = input.nextLine();
					System.out.println("Informe o Telefone(somente numeros): ");
					telefone = input.nextLong();
					input.nextLine();
					System.out.println("Informe o CPF: ");
					cpf = input.nextLong();
					input.nextLine();
					System.out.println("Informe a Meta Mensal das Vendas: ");
					mVendas = input.nextInt();
					input.nextLine();
					System.out.println();

					Funcionarios v = new Vendedor(id, nome, email, telefone, cpf, cargo, mVendas);
					correcaoId(v);
					funcionarios.add(v);
					//funcionarios.add(new Vendedor(id, nome, email, telefone, cpf, cargo, qntVendas));

					System.out.println("Vendedor "+ nome +" cadastrado com sucesso!");
					flag = 1;
					break;
				case 2:
					System.out.println("Informe o código de identificação do gerente: ");
					id = input.nextInt();
					input.nextLine();
					System.out.println("Informe o Nome Completo: ");
					nome = input.nextLine();
					System.out.println("Informe o Email: ");
					email = input.nextLine();
					System.out.println("Informe o Telefone(somente numeros): ");
					telefone = input.nextLong();
					input.nextLine();
					System.out.println("Informe o CPF: ");
					cpf = input.nextLong();
					input.nextLine();
					System.out.println("Informe a Quantidade de Pessoas Supervisionadas: ");
					pSuperv = input.nextInt();
					input.nextLine();
					System.out.println();

					Funcionarios g = new Gerente(id, nome, email, telefone, cpf, cargo, pSuperv);
					correcaoId(g);
					funcionarios.add(g);
					//funcionarios.add(new Gerente(id, nome, email, telefone, cpf, cargo, qntHoras));

					System.out.println("Gerente "+ nome +" cadastrado com sucesso!");
					flag = 1;
					break;
				default:
					System.out.println("Opção Invalida!!!");
					System.out.println("Digite Novamente");
					System.out.println();
			}
		}
	}
}
