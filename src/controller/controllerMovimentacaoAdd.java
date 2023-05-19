package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controllerMovimentacaoAdd {

    @FXML
    private Button botaoVoltar;

    @FXML
    void voltar(ActionEvent event) {
        App.changeScreen("movimentacao");
    }
}