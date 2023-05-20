package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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

    private DataModel dataModel;

    @FXML
    void addVendedor(ActionEvent event) {
        String nome = nomeV.getText();
        String email = emailV.getText();
        int id = Integer.parseInt(IdentificaçãoV.getText());
        String cargo = "Vendedor";
        long cpf = Long.parseLong(cpfV.getText());
        long telefone = Long.parseLong(telefoneV.getText());
        int metaVendas = Integer.parseInt(metaV.getText());

        if (!nome.isEmpty() && !email.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Gerenciamento de Funcionários");
            alert.setHeaderText("VENDEDOR ADICIONADO!");
            alert.show();
            DataEntry dataEntry = new DataEntryFuncionarios(id, nome, email, cargo);
            dataModel.addData(dataEntry);
            clearFields();
            App.changeScreen("funcionario");

        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Aviso");
            alert.setHeaderText(null);
            alert.setContentText("Preencha todos os campos.");
            alert.showAndWait();
        }

    }

    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    private void clearFields() {
        IdentificaçãoV.clear();
        cpfV.clear();
        emailV.clear();
        nomeV.clear();
        metaV.clear();
        telefoneV.clear();
    }

    @FXML
    void voltarFuncionario(ActionEvent event) {
        App.changeScreen("selecionar_funcionario");
    }
}
