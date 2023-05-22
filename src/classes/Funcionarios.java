package classes;

import java.util.Scanner;

public abstract class Funcionarios{

    private String nome;
    private long cpf;
    private int id;
    private String email;
    private long telefone;
    private int cargo;

    Scanner input = new Scanner(System.in);

    public Funcionarios(int id, String nome, String email, long telefone, long cpf, int cargo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefone() {
        return telefone;
    }

    public long getCPF() {
        return cpf;
    }

    public int getCargo() {
        return cargo;
    }

    public abstract void imprimir();

    public void M_Inicial() {// função de apoio
        System.out.println("Informe o campo que deseja alterar:");
        System.out.println("ID(1);\n" + "Nome Completo(2);\n" + "Email(3);\n" + "Telefone(4);\n" + "CPF(5);\n"
                + "Cargo(6);\n" + "Sair(7).");
    }

    public void editar(String dado, String dadoDaEdicao) throws Exception{// Alterar detalhes de um empregado
        int opcao = 0;
        if (dado == "Nome") opcao = 1;
        else if (dado == "Email") opcao = 2;
        else if (dado == "Telefone") opcao = 3;
        else if (dado == "CPF") opcao = 4;
        else if (dado == "Supervisão ou Meta") opcao = 5;
        System.out.println(opcao);
        switch (opcao) {
            case 1:
                this.nome = dadoDaEdicao;
                break;
            case 2:
                this.email = dadoDaEdicao;
                break;
            case 3:
                this.telefone = Integer.parseInt(dadoDaEdicao);
                break;
            case 4:
                this.cpf = Long.parseLong(dadoDaEdicao);
                break;
            case 5:
                // meta ou supervisão
                break;
        }
    }
}
