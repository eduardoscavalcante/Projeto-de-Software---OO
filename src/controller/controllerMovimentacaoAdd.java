package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controllerMovimentacaoAdd {
    
    Movimentacao mov = new Movimentacao();

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
    private TextField destino;

    @FXML
    void botaoAdicionar(ActionEvent event) {
        mov.setId(Integer.parseInt(idProduto.getText()));
        mov.setIdResponsavel(Integer.parseInt(idResponsavel.getText()));
        mov.setIdProduto(Integer.parseInt(idProduto.getText()));
        mov.setTipoProduto("NULL");
        mov.setOrigem(origem.getText());
        mov.setDataMovimentacao(data.getText());

        System.out.println("--------" + mov.getId() + "-----------");
    }

    @FXML
    void voltar(ActionEvent event) {
        App.changeScreen("movimentacao");
    }

}