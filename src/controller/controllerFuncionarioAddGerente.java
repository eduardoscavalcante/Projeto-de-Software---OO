package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.*;

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
    
    private DataModel dataModel;

    @FXML
    void AddGerente(ActionEvent event) throws NumberFormatException, Exception {

        App.dadosFuncionario(Integer.parseInt(IdentificaçãoG.getText()), Long.parseLong(cpfG.getText()), Long.parseLong(telefoneG.getText()), Integer.parseInt(supG.getText()), nomeG.getText(), emailG.getText(), 2);

        String nome = nomeG.getText();
        String email = emailG.getText();
        int id = Integer.parseInt(IdentificaçãoG.getText());
        String cargo = "Gerente";

        boolean idExistente = GerenciamentoFuncionarios.getCorrecaoId();
        if(idExistente == false){
            if (!nome.isEmpty() && !email.isEmpty()) {
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

        App.changeScreen("funcionario");
    }

    @FXML
    void voltarFuncionario(ActionEvent event) {
        App.changeScreen("selecionar_funcionario");
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
}
