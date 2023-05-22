package controller;

import classes.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controllerFuncionarioEdicao {

    @FXML
    private static Label label;

    @FXML
    private TextField novoValor;

    @FXML
    private Button submeter;

    @FXML
    private Button voltarSelecao;

    private static int idDaEdicao;
    private static String dadoDaEdicao;
    public static void recebeDado(String dado){
        dadoDaEdicao = dado;
    }
    public static void recebeId(int id){
        idDaEdicao = id;
    }
    
    @FXML
    void voltarSelecao(ActionEvent event) {
        App.changeScreen("editar_funcionario_selecao");
    }

    @FXML 
    void submeter(ActionEvent event){
        App.editarFuncionario(idDaEdicao, dadoDaEdicao, novoValor.getText());
        System.out.println("so um print: " + idDaEdicao);
        System.out.println("Dado: " + dadoDaEdicao);
    }

    public void displayLabel(String dado){
        label.setText("Digite o novo valor para:");
    }
}
