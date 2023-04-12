package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controllerAddGerente {

    GerenciamentoFuncionarios gf = new GerenciamentoFuncionarios();
    
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

    @FXML
    void AddGerente(ActionEvent event) {
        long cpfint = Long.parseLong(cpfG.getText());
        int idint = Integer.parseInt(IdentificaçãoG.getText());
        long telefoneint = Long.parseLong(telefoneG.getText());
        int supGint = Integer.parseInt(supG.getText());
        int cargo = 2;
        String nome = nomeG.getText();
        long cpf = cpfint;
        int id = idint;
        String email = emailG.getText();
        long telefone = telefoneint;
        int pSuperv = supGint;
        
        Funcionarios v = new Gerente(id, nome, email, telefone, cpf, cargo, pSuperv);
        // gf.correcaoId(v);
        gf.addVendedor(v);
        gf.imprimirFuncionarios();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Gerenciamento de Produtos");
        alert.setHeaderText("GERENTE ADICIONADO!");
        alert.show();
        App.changeScreen("funcionario");
    }

    @FXML
    void voltarFuncionario(ActionEvent event) {
        App.changeScreen("funcionario");
    }

}
