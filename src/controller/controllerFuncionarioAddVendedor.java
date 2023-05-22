package controller;

import classes.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.*;

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
    void voltarFuncionario(ActionEvent event) {
        App.changeScreen("selecionar_funcionario");
    }
    @FXML
    void addVendedor(ActionEvent event) throws NumberFormatException, Exception {
        App.dadosFuncionario(Integer.parseInt(IdentificaçãoV.getText()), Long.parseLong(cpfV.getText()), Long.parseLong(telefoneV.getText()), Integer.parseInt(metaV.getText()), nomeV.getText(), emailV.getText(), 1);


        String nome = nomeV.getText();
        String email = emailV.getText();
        int id = Integer.parseInt(IdentificaçãoV.getText());
        String cargo = "Vendedor";

        boolean idExistente = GerenciamentoFuncionarios.getCorrecaoId();
        if(idExistente == false){
            if (!nome.isEmpty() && !email.isEmpty()) {
                DataEntry dataEntry = new DataEntryFuncionarios(id, nome, email, cargo);
                dataModel.addData(dataEntry);
                clearFields();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Aviso");
                alert.setHeaderText(null);
                alert.setContentText("Preencha todos os campos.");
                alert.showAndWait();
            }
    }
        App.changeScreen("funcionario");
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
}
