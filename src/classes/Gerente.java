package classes;

import java.util.Scanner;

public class Gerente extends Funcionarios{
	Scanner input = new Scanner(System.in);

    private int pessoasSupervisionadas;
	
	public Gerente(int id, String nome, String email, long telefone, long cpf, int cargo, int pesSuperv) {
		super(id, nome, email, telefone, cpf, cargo, pesSuperv);
		this.pessoasSupervisionadas = pesSuperv;
	}

    public int getpessoasSupervisionadas() {
        return pessoasSupervisionadas;
    }
}
