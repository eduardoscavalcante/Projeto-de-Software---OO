package classes;

import java.util.Scanner;

public class TipoProduto{

    //Scanner input = new Scanner(System.in);
    // Produtos produto = new Produtos();
    GerenciamentoEstado ge = new GerenciamentoEstado();

    public void M_Inicial() {// função de apoio

        System.out.println("Informe a Categoria do Produto(somente numeros):");
        System.out.println("Roupa Feminina(1);\n" + "Roupa Masculina(2);\n" + "Roupa Infantil(3);\n"
                + "Calçados(4);\n" + "Artigos de Casa(5);\n" + "Acessórios(6);\n" + "Eletrônicos(7);\n" + "Perfumes(8)");
    }

    // public void produto(int id, String nome, String tamanho, String cor, String marca, float preço, String fabricante, String fornecedor, int quantidade, String categoria) throws Exception{
    //     produto.setId(id);
    //     produto.setNome(nome);
    //     produto.setTamanho(tamanho);
    //     produto.setCor(cor);
    //     produto.setMarca(marca);
    //     produto.setPreco(preço);
    //     produto.setFabricante(fabricante);
    //     produto.setFornecedor(fornecedor);
    //     produto.setQuantidade(quantidade);
    //     produto.setCategoria(categoria);

    //     ge.verificaQuantidade(produto);
    //     produto.imprimir();
    // }

    public String CategoriaProduto(){

        // int tipoProduto;
        // M_Inicial();
        // tipoProduto = input.nextInt();
        // input.nextLine();
        // switch(tipoProduto){
        //     case 1:
        //         return "Roupa Feminina";
        //     case 2:
        //         return "Roupa Masculina";
        //     case 3:
        //         return "Roupa Infantil";
        //     case 4:
        //         return "Calçados";
        //     case 5:
        //         return "Artigos de Casa";
        //     case 6:
        //         return "Acessórios";
        //     case 7:
        //         return "Eletrônicos";
        //     case 8:
        //         return "Perfumes";
        //     default:
        //         return "Tipo Invalido!!";
        // }
        return "Tipo Invalido!!";
    }
}
