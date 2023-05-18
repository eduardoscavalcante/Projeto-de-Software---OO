package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class controllerAddFuncionario {

    @FXML
    private ComboBox<?> CombCategoria;

    @FXML
    private TextField Identificação;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField cor;

    @FXML
    private TextField marca;

    @FXML
    private TextField nome;

    @FXML
    private TextField preco;

    @FXML
    private TextField tamanho;

    @FXML
    void voltarFuncionario(ActionEvent event) {
        App.changeScreen("funcionario");
    }
}
