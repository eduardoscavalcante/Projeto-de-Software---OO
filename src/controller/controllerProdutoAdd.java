package controller;

import java.net.URL;
import java.util.ResourceBundle;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class controllerProdutoAdd implements Initializable{

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

    public void add(ActionEvent event) throws Exception{
        App.dadosProduto(Integer.parseInt(Identificação.getText()), nome.getText(), tamanho.getText(), cor.getText(), marca.getText(), Float.parseFloat(preco.getText()),fabricante.getText(), fornecedor.getText(), Integer.parseInt(quantidade.getText()), CombCategoria.getValue());
        App.changeScreen("produto");
    }
}
