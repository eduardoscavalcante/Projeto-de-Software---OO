package controller;

import java.net.URL;
import java.util.ResourceBundle;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class controllerProduto implements Initializable{

    @FXML
    private Button adicionarProduto;

    @FXML
    private Button botaoGerar;

    @FXML
    private Button editarProduto;

    @FXML
    private Button removerProduto;

    @FXML
    private Button voltarHome;

    @FXML
    private Button backRemove;

    @FXML
    private TableColumn<Produtos, String> categoria;

    @FXML
    private TableColumn<Produtos, String> fabricante;

    @FXML
    private TableColumn<Produtos, String> fornecedor;

    @FXML
    private TableColumn<Produtos, Integer> id;

    @FXML
    private TableColumn<Produtos, String> marca;

    @FXML
    private TableColumn<Produtos, String> nome;

    @FXML
    private TableColumn<Produtos, Float> preco;

    @FXML
    private TableColumn<Produtos, Integer> quantidade;
    
    @FXML
    private TableView<Produtos> tabela;

    @FXML
    private TableColumn<Produtos, String> tamanho;

    

    @FXML
    void addProduto(ActionEvent event) {
        App.changeScreen("add_produto");
    }
    // voltar da tela de produtos
    @FXML
    void backHome(ActionEvent event) {
        App.changeScreen("main");
    }

    @FXML
    void editProduto(ActionEvent event) {
        App.changeScreen("edit_produto");
    }

    @FXML
    void removeProduto(ActionEvent event) {
        App.changeScreen("remove_produto");
    }

    @FXML
    void backProduto(ActionEvent event) {
        App.changeScreen("produto");
    }

    @FXML
    void gerarRelatorio(ActionEvent event) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}
