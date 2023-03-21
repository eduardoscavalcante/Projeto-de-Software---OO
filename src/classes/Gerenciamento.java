package classes;

import java.util.List;
import java.util.ArrayList;

public class Gerenciamento {
	List<Produtos> produtos = new ArrayList<>();

	public void adicionarProdutos(Produtos cp) {
	    produtos.add(cp);
	}

	public void imprimirProdutos() {
	    produtos.forEach((p) -> {
	    	System.out.println("***********RELATÓRIO DO PRODUTO:**********");
            System.out.println("Identificação: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Tamanho: " + p.getTamanho());
            System.out.println("Cor: " + p.getCor());
            System.out.println("Marca: " + p.getMarca());
            System.out.println("Preço: " + p.getPreco());
            System.out.println("Tipo: " + p.getTipo());
            System.out.println("Categoria: " + p.getCategoria());
            System.out.println("Fabricante: " + p.getFabricante());
            System.out.println("Fornecedor: " + p.getFornecedor());
            System.out.println("Quantidade: " + p.getQuantidade());
            System.out.println("Status do Produto: " + p.getStatus());
            System.out.println("Localidade: Matriz");
            System.out.println("******************************************");
	    });
	}
}

