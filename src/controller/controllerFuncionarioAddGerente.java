package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controllerFuncionarioAddGerente {
    
    @FXML
    private TextField IdentificaçãoG;

    @FXML
    private Button botaoAddGerente;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField cpfG;

    @FXML
    private TextField emailG;

    @FXML
    private TextField nomeG;

    @FXML
    private TextField supG;

    @FXML
    private TextField telefoneG;
    //Imprimir na tabela da tela de funcionarios
    
    class gerenteTabela{
        static String name;
        static String carg;
        static String contact;
        static int iden;
    }

    @FXML
    void AddGerente(ActionEvent event) throws NumberFormatException, Exception {

        App.dadosFuncionario(Integer.parseInt(IdentificaçãoG.getText()), Long.parseLong(cpfG.getText()), Long.parseLong(telefoneG.getText()), Integer.parseInt(supG.getText()), nomeG.getText(), emailG.getText(), 2);
        // long cpfint = Long.parseLong(cpfG.getText());
        // int idint = Integer.parseInt(IdentificaçãoG.getText());
        // long telefoneint = Long.parseLong(telefoneG.getText());
        // int supGint = Integer.parseInt(supG.getText());
        // int cargo = 2;
        // String nome = nomeG.getText();
        // long cpf = cpfint;
        // int id = idint;
        // String email = emailG.getText();
        // long telefone = telefoneint;
        // int pSuperv = supGint;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Gerenciamento de Produtos");
        alert.setHeaderText("GERENTE ADICIONADO!");
        alert.show();
        App.changeScreen("funcionario");
    }

    @FXML
    void voltarFuncionario(ActionEvent event) {
        App.changeScreen("selecionar_funcionario");
    }
}
