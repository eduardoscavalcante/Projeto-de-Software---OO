package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controllerProdutos {

    @FXML
    private Button adicionarProduto;

    @FXML
    private Button editarProduto;

    @FXML
    private Button removerProduto;

    @FXML
    private Button voltarHome;

    @FXML
    private Button backRemove;

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
}
