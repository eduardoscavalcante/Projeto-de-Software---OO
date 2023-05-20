package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controllerMovimentacaoAdd {
    

    @FXML
    private Button adicionar;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField idMovimentacao;

    @FXML
    private TextField data;

    @FXML
    private TextField idProduto;

    @FXML
    private TextField idResponsavel;

    @FXML
    private TextField origem;

    @FXML
    private TextField destino;

    @FXML
    void botaoAdicionar(ActionEvent event) throws Exception {
        App.dadosMovimentacao(Integer.parseInt(idMovimentacao.getText()), Integer.parseInt(idResponsavel.getText()), Integer.parseInt(idProduto.getText()), origem.getText(), destino.getText(), data.getText());
        App.changeScreen("movimentacao");
    }

    @FXML
    void voltar(ActionEvent event) {
        App.changeScreen("movimentacao");
    }

}