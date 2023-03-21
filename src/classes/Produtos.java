package classes;

import java.util.Scanner;

public class Produtos implements Base{

    public int id;
    public String nome;
    public String tamanho;
    public String cor;
    public String marca;
    public int preco;
    public String tipo;
    public String categoria;
    public String fabricante;
    public String fornecedor;
    public int quantidade;
    public String status;

    Scanner input = new Scanner(System.in);

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public int getPreco(){
        return preco;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }

    public String getFornecedor(){
        return fornecedor;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public void imprimir() {

        if (getId() != -1) {
            System.out.println("***********RELATÓRIO DO PRODUTO:**********");
            System.out.println("Identificação: " + getId());
            System.out.println("Nome: " + getNome());
            System.out.println("Tamanho: " + getTamanho());
            System.out.println("Cor: " + getCor());
            System.out.println("Marca: " + getMarca());
            System.out.println("Preço: " + getPreco());
            System.out.println("Tipo: " + getTipo());
            System.out.println("Categoria: " + getCategoria());
            System.out.println("Fabricante: " + getFabricante());
            System.out.println("Fornecedor: " + getFornecedor());
            System.out.println("Quantidade: " + getQuantidade());
            System.out.println("Status do Produto: " + getStatus());
            System.out.println("Localidade: Matriz");
            System.out.println("******************************************");

        } else {
            System.out.println("Produto não existente");
        }
        System.out.println();
    }

    public void adicionar(int ficha) {// Adição de um produto

        int aux1;
        String aux2;

        setId(ficha);
        System.out.println("Informe o código de identificação do produto: ");
        aux1 = input.nextInt();
        input.nextLine();
        setId(aux1);
        System.out.println("Informe o Nome: ");
        aux2 = input.nextLine();
        setNome(aux2);
        System.out.println("Informe o Tamanho: ");
        aux2 = input.nextLine();
        setTamanho(aux2);
        System.out.println("Informe a cor: ");
        aux2 = input.nextLine();
        setCor(aux2);
        System.out.println("Informe a marca: ");
        aux2 = input.nextLine();
        setMarca(aux2);
        System.out.println("Informe o preco: ");
        aux1 = input.nextInt();
        input.nextLine();
        setPreco(aux1);
        System.out.println("Informe o tipo: ");
        aux2 = input.nextLine();
        setTipo(aux2);
        System.out.println("Informe a categoria: ");
        aux2 = input.nextLine();
        setCategoria(aux2);
        System.out.println("Informe o fabricante: ");
        aux2 = input.nextLine();
        setFabricante(aux2);
        System.out.println("Informe o fornecedor: ");
        aux2 = input.nextLine();
        setFornecedor(aux2);
        System.out.println("Informe a quantidade: ");
        aux1 = input.nextInt();
        input.nextLine();
        setQuantidade(aux1);

        if (getQuantidade()!=0){
            setStatus("Em estoque");
        }

        else{
            setStatus("Esgotado");
        }
        imprimir();
    }

    public void remover_produto() {// Remoção de um produto

        int aux1 = -1;
        String aux2 = null;

        setId(aux1);
        setNome(aux2);
        setTamanho(aux2);
        setCor(aux2);
        setMarca(aux2);
        setPreco(aux1);
        setTipo(aux2);
        setCategoria(aux2);
        setFabricante(aux2);
        setFornecedor(aux2);
        setQuantidade(aux1);
        setStatus(aux2);
        imprimir();
    }

    public void M_Inicial() {// função de apoio

        System.out.println("Informe o campo que deseja alterar:");
        System.out.println("ID(1);\n" + "Nome(2);\n" + "Tamanho(3);\n" +
                "Cor(4);\n" + "Marca(5);\n" + "Preço(6);\n" + "Tipo(7);\n" + "Categoria(8);\n" +
                "Fabricante(9);\n" + "Fornecedor(10);\n" + "Quantidade(11);\n" + "Status(12)\n"
                + "Sair(13).");
    }

    public void editar() {// Alterar detalhes de um produto

        int opcao = 1;
        int aux1;
        String aux2;

        while (opcao != 13) {

            M_Inicial();
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o Novo Id (atual: " + getId() + "): ");
                    aux1 = input.nextInt();
                    setId(aux1);
                    input.nextLine();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe o Novo Nome (atual: " + getNome() + "): ");
                    aux2 = input.nextLine();
                    setNome(aux2);
                    input.nextLine();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o Novo Tamanho (atual: " + getTamanho() + " ): ");
                    aux2 = input.nextLine();
                    setTamanho(aux2);
                    input.nextLine();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Informe a Nova Cor (atual: " + getCor() + "): ");
                    aux2 = input.nextLine();
                    setCor(aux2);
                    input.nextLine();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Informe a Nova Marca (atual: " + getMarca() + "): ");
                    aux2 = input.nextLine();
                    setMarca(aux2);
                    input.nextLine();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Informe o Novo Preço (atual: " + getPreco() + "): ");
                    aux1 = input.nextInt();
                    setPreco(aux1);
                    input.nextLine();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Informe o Novo Tipo (atual: " + getTipo() + "): ");
                    aux2 = input.nextLine();
                    setTipo(aux2);
                    input.nextLine();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Informe a Nova Categoria (atual: " + getCategoria() + "): ");
                    aux2 = input.nextLine();
                    setCategoria(aux2);
                    input.nextLine();
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Informe o Novo Fabricante (atual: " + getFabricante() + "): ");
                    aux2 = input.nextLine();
                    setFabricante(aux2);
                    input.nextLine();
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Informe o Novo Fornecedor (atual: " + getFornecedor() + "): ");
                    aux2 = input.nextLine();
                    setFornecedor(aux2);
                    input.nextLine();
                    System.out.println();
                    break;

                case 11:
                    System.out.println("Informe a Nova Quantidade (atual: " + getQuantidade() + "): ");
                    aux1 = input.nextInt();
                    setQuantidade(aux1);
                    input.nextLine();
                    System.out.println();
                    break;
                case 12:
                    System.out.println("Informe o Novo Status (atual: " + getStatus() + "): ");
                    aux2 = input.nextLine();
                    setStatus(aux2);
                    input.nextLine();
                    System.out.println();
                    break;

                case 13:
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
