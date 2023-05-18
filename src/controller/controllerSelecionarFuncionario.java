package controller;

import java.net.URL;
import java.util.ResourceBundle;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class controllerSelecionarFuncionario implements Initializable{

    GerenciamentoFuncionarios gf = new GerenciamentoFuncionarios();
    private String[] opcao_funcionario = {"Vendedor","Gerente"};

    @FXML
    private Button botaoSelecionar;

    @FXML
    private Button botaoVoltarSelect;

    @FXML
    private ComboBox<String> combSelecionar;

    public void initialize(URL arg0, ResourceBundle arg1) {
		
		combSelecionar.getItems().addAll(opcao_funcionario);
	}

    @FXML
    void voltarFuncionario(ActionEvent event) {
        App.changeScreen("funcionario");
    }

    @FXML
    void selecButton(ActionEvent event) {
        String acaoF = combSelecionar.getValue();

        if (acaoF == "Vendedor"){
            App.changeScreen("add_vendedor");

            
        }
        else if (acaoF == "Gerente"){
            App.changeScreen("add_gerente");
        }
    }

}
