package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import classes.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class controllerFuncionarioSelecionarEdicao implements Initializable {

    private String[] opcao_edicao = {"Nome","Email","Telefone", "CPF", "Supervisão ou Meta"};

    @FXML
    private Button Editar;

    @FXML
    private Button backRemove;

    @FXML
    private ComboBox<String> selecionarDado;

    public void initialize(URL arg0, ResourceBundle arg1) {
		
		selecionarDado.getItems().addAll(opcao_edicao);
	}

    @FXML
    void botaoEditarSelecao(ActionEvent event) throws IOException {
        App.changeScreen("edit_funcionario");
        // String dado = selecionarDado.getValue();
        // controllerFuncionarioEdicao.displaylabel(dado);
    }
    @FXML
    void voltarFuncionario(ActionEvent event) {
        App.changeScreen("funcionario");
    }

}