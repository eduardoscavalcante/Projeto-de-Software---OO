package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controllerMovimentacao {

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

    }

    @FXML
    void editBotao(ActionEvent event) {

    }

    @FXML
    void removeBotao(ActionEvent event) {

    }

    @FXML
    void voltarMain(ActionEvent event) {
        App.changeScreen("main");
    }

}
