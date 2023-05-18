package controller;

import java.net.URL;
import java.util.ResourceBundle;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class controllerAddProduto implements Initializable{
    Produtos produto = new Produtos();

    private String[] categoria_produto = {"Roupa Feminina","Roupa Masculina","Roupa Infantil", "Calçados", "Artigos de Casa", "Acessórios", "Eletrônicos", "Perfumes"};

    @FXML
    private ComboBox<String> CombCategoria;

    @FXML
    private TextField Identificação;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField cor;

    @FXML
    private TextField fabricante;

    @FXML
    private TextField fornecedor;

    @FXML
    private TextField marca;

    @FXML
    private TextField nome;

    @FXML
    private TextField preco;

    @FXML
    private TextField quantidade;

    @FXML
    private TextField tamanho;

    @FXML
    void backProdutos(ActionEvent event) {
        App.changeScreen("produto");
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
		
		CombCategoria.getItems().addAll(categoria_produto);
		
	}

    public int id;
    public float precoConvert;
    public int quantidadeConvert;
    //adiciona um produto
    public void add(ActionEvent event) throws Exception{
        produto.setId(id);
        id = Integer.parseInt(Identificação.getText());
        precoConvert = Float.parseFloat(preco.getText());
        quantidadeConvert = Integer.parseInt(quantidade.getText());
        produto.setCor(cor.getText());
        produto.setNome(nome.getText());
        produto.setTamanho(tamanho.getText());
        produto.setMarca(marca.getText());
        produto.setPreco(precoConvert);
        produto.setCategoria(1);
        produto.setFabricante(fabricante.getText());
        produto.setFornecedor(fornecedor.getText());
        produto.setQuantidade(quantidadeConvert);
        produto.setStatus("Em estoque");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Gerenciamento de Produtos");
            alert.setHeaderText("PRODUTO ADICIONADO!");
            alert.show();
        App.changeScreen("produto");
    }
}
