package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controllerFuncionarioAddGerente {

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

    private DataModel dataModel;

    @FXML
    void AddGerente(ActionEvent event) {
        String nome = nomeG.getText();
        String email = emailG.getText();
        int id = Integer.parseInt(IdentificaçãoG.getText());
        String cargo = "Gerente";
        long cpf = Long.parseLong(cpfG.getText());
        long telefone = Long.parseLong(telefoneG.getText());
        int pSuperv = Integer.parseInt(supG.getText());

        if (!nome.isEmpty() && !email.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Gerenciamento de Funcionários");
            alert.setHeaderText("GERENTE ADICIONADO!");
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
        IdentificaçãoG.clear();
        cpfG.clear();
        emailG.clear();
        nomeG.clear();
        supG.clear();
        telefoneG.clear();
    }

    @FXML
    void voltarFuncionario(ActionEvent event) {
        App.changeScreen("selecionar_funcionario");
    }
}
