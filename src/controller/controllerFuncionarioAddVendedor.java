package controller;

import classes.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controllerFuncionarioAddVendedor {
    GerenciamentoFuncionarios gf = new GerenciamentoFuncionarios();
    
    @FXML
    private TextField IdentificaçãoV;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField cpfV;

    @FXML
    private TextField emailV;

    @FXML
    private TextField metaV;

    @FXML
    private TextField nomeV;

    @FXML
    private TextField telefoneV;

    @FXML
    private Button adicionarVendedor;

    @FXML
    void voltarFuncionario(ActionEvent event) {
        App.changeScreen("selecionar_funcionario");
    }
    @FXML
    void addVendedor(ActionEvent event) throws NumberFormatException, Exception {
        App.dadosFuncionario(Integer.parseInt(IdentificaçãoV.getText()), Long.parseLong(cpfV.getText()), Long.parseLong(telefoneV.getText()), Integer.parseInt(metaV.getText()), nomeV.getText(), emailV.getText(), 1);
        App.changeScreen("funcionario");
        
        // long cpfint = Long.parseLong(cpfV.getText());
        // int idint = Integer.parseInt(IdentificaçãoV.getText());
        // long telefoneint = Long.parseLong(telefoneV.getText());
        // int mVendasint = Integer.parseInt(metaV.getText());
        // int cargo = 1;
        // String nome = nomeV.getText();
        // long cpf = cpfint;
        // int id = idint;
        // String email = emailV.getText();
        // long telefone = telefoneint;
        // int mVendas = mVendasint;

        // Funcionarios v = new Vendedor(id, nome, email, telefone, cpf, cargo, mVendas);
        // gf.correcaoId(v);
        //gf.addVendedor(v);
        // gf.imprimirFuncionarios();
        // Alert alert = new Alert(Alert.AlertType.INFORMATION);
        // alert.setTitle("Gerenciamento de Produtos");
        // alert.setHeaderText("VENDEDOR ADICIONADO!");
        // alert.show();
        // App.changeScreen("funcionario");
        
    }

    


    
    // correcaoId(v);
    // funcionarios.add(v);

}
