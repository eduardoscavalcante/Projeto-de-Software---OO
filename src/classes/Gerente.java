package classes;

import java.util.Scanner;

public class Gerente extends Funcionarios implements Base{

    private int idGerente;

    Scanner input = new Scanner(System.in);

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

    public int getIdGerente() {
        return idGerente;
    }

    public void imprimir() {

        if (getId() != -1) {
            System.out.println("********RELATÓRIO DO FUNCIONÁRIO:*********");
            System.out.println("Identificação: " + getId());
            System.out.println("Nome: " + getNome());
            System.out.println("Email: " + getEmail());
            System.out.println("Telefone: " + getTelefone());
            System.out.println("CPF: " + getCPF());
            System.out.println("Cargo: " + getCargo());
            System.out.println("******************************************");
        } else {
            System.out.println("Funcionario não existente");
        }
        System.out.println();
    }

    public void adicionar(int ficha) {// Adição de um empregado

        long aux1;
        String aux2;

        setId(ficha);
        System.out.println("Informe o Nome Completo: ");
        aux2 = input.nextLine();
        setNome(aux2);
        System.out.println("Informe o Email: ");
        aux2 = input.nextLine();
        setEmail(aux2);
        System.out.println("Informe o Telefone(somente numeros): ");
        aux1 = input.nextLong();
        setTelefone(aux1);
        input.nextLine();
        System.out.println("Informe o CPF: ");
        aux1 = input.nextLong();
        setCPF(aux1);
        System.out.println("Informe o Cargo: ");
        aux2 = input.nextLine();
        setCargo(aux2);
        System.out.println();
        imprimir();
    }

    public void rem_e() {// Remoção de um empregado

        int aux1 = -1;
        String aux2 = null;

        setId(aux1);
        setNome(aux2);
        setEmail(aux2);
        setTelefone(aux1);
        setCPF(aux1);
        setCargo(aux2);
        imprimir();
    }

    public void M_Inicial() {// função de apoio

        System.out.println("Informe o campo que deseja alterar:");
        System.out.println("Nome Completo(1);\n" + "Email(2);\n" + "Telefone(3);\n" + "CPF(4);\n"
                + "Cargo(5);\n" + "Sair(6).");
    }

    public void editar() {// Alterar detalhes de um empregado

        int opcao = 1;
        long aux1;
        String aux2;
        double aux3;

        while (opcao != 6) {

            M_Inicial();
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o Novo Nome Completo: ");
                    aux2 = input.nextLine();
                    setNome(aux2);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe o Novo Email: ");
                    aux2 = input.nextLine();
                    setEmail(aux2);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o Novo Telefone(somente numeros): ");
                    aux1 = input.nextLong();
                    setTelefone(aux1);
                    input.nextLine();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Informe o Novo CPF(somente numeros): ");
                    aux1 = input.nextLong();
                    setCPF(aux1);
                    input.nextLine();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Informe o Novo Cargo: ");
                    aux2 = input.nextLine();
                    setCargo(aux2);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Modificações Salvas!!");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção Invalida!!!");
                    System.out.println("Digite Novamente");
                    System.out.println();
            }
        }
        imprimir();
    }
}