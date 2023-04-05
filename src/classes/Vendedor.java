package classes;

import java.util.Scanner;

public class Vendedor extends Funcionarios{
	Scanner input = new Scanner(System.in);

    private int metaVendas;
	
	public Vendedor(int id, String nome, String email, long telefone, long cpf, int cargo, int metaVendas) {
		super(id, nome, email, telefone, cpf, cargo, metaVendas);
		this.metaVendas = metaVendas;
	}

    public int getMetaVendas() {
        return metaVendas;
    }
}
