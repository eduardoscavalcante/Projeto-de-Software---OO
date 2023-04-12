package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class controllerHome {

    @FXML
    private Button botaoRedo;

    @FXML
    private Button botaoRelatorio;

    @FXML
    private Button botaoProduto;

    @FXML
    private Button botaoMovimentacao;

    @FXML
    private Button botaoSair;
    
    @FXML
    private Button botaoFuncionario;

    @FXML
    void exitButton(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void telaProduto(ActionEvent event) {
        App.changeScreen("produto");
    }

    @FXML
    void funcionario(ActionEvent event) {
        App.changeScreen("funcionario");
    }

    @FXML
    void movBotao(ActionEvent event) {
        App.changeScreen("movimentacao");
    }

    
    @FXML
    void telaRedo(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Gerenciamento");
        alert.setHeaderText("Em reforma!");
        alert.show();
    }

    @FXML
    void telaRelatorio(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Gerenciamento");
        alert.setHeaderText("Em reforma!");
        alert.show();
    }
}
