package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.print.event.PrintEvent;

import classes.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class controllerFuncionario implements Initializable {

    @FXML
    private Button botaoAdicionar;

    @FXML
    private Button botaoEditar;

    @FXML
    private Button botaoRemover;

    @FXML
    private Button botaoVoltar;

    @FXML
    void addBotao(ActionEvent event) {
        App.changeScreen("selecionar_funcionario");
    }

    @FXML
    void editBotao(ActionEvent event) {
        App.changeScreen("edit_funcionario");
    }

    @FXML
    void removeBotao(ActionEvent event) {
        App.changeScreen("remove_funcionario");
        // Colocar na tabela
        // System.out.println(gerenteTabela.iden);
    }

    @FXML
    void voltarMain(ActionEvent event) {
        App.changeScreen("main");
    }

    @FXML
    private TableView<DataEntry> tabelaFuncionarios;
    @FXML
    private TableColumn<DataEntry, String> tabNome;
    @FXML
    private TableColumn<DataEntry, String> TabEmail;
    @FXML
    private TableColumn<DataEntry, String> tabCargo;
    @FXML
    private TableColumn<DataEntry, Integer> tabId;

    private DataModel dataModel;

    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
        tabelaFuncionarios.setItems(dataModel.getDataList());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tabNome.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
        TabEmail.setCellValueFactory(cellData -> cellData.getValue().emailProperty());
        tabId.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        tabCargo.setCellValueFactory(cellData -> cellData.getValue().cargoProperty());

        botaoRemover.setOnAction(event -> removeSelectedEntry());
    }

    private void removeSelectedEntry() {
        DataEntry selectedEntry = tabelaFuncionarios.getSelectionModel().getSelectedItem();
        if (selectedEntry != null) {
            System.out.println("aquii");
            dataModel.removeData(selectedEntry);
        }
    }
}
