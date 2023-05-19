package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controllerMovimentacaoAdd {

    @FXML
    private Button adicionar;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField data;

    @FXML
    private TextField idProduto;

    @FXML
    private TextField idResponsavel;

    @FXML
    private TextField origem;

    @FXML
    void botaoAdicionar(ActionEvent event) {

    }

    @FXML
    void voltar(ActionEvent event) {
        App.changeScreen("movimentacao");
    }

}
