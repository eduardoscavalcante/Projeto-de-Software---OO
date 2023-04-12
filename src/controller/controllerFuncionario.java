package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controllerFuncionario {

    @FXML
    private Button botaoAdicionar;

    @FXML
    private Button botaoEditar;

    @FXML
    private Button botaoRemover;

    @FXML
    private Button botaoVoltar;

    @FXML
    void addBotao(ActionEvent event) {
        App.changeScreen("add_funcionario");
    }

    @FXML
    void editBotao(ActionEvent event) {
        App.changeScreen("edit_funcionario");
    }

    @FXML
    void removeBotao(ActionEvent event) {
        App.changeScreen("remove_funcionario");
    }

    @FXML
    void voltarMain(ActionEvent event) {
        App.changeScreen("main");
    }

}
