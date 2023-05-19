package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import classes.*;
import controller.controllerFuncionarioAddGerente.gerenteTabela;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class controllerFuncionario implements Initializable{

    
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
        //Colocar na tabela
        //System.out.println(gerenteTabela.iden);
    }

    @FXML
    void voltarMain(ActionEvent event) {
        App.changeScreen("main");
    }

    
    @FXML
    private TableView<gerenteTabela> tabelaFuncionarios;

    @FXML
    private TableColumn<gerenteTabela, String> TabEmail;

    @FXML
    private TableColumn<gerenteTabela, String> tabCargo;

    @FXML
    private TableColumn<gerenteTabela, Integer> tabId;

    @FXML
    private TableColumn<gerenteTabela, String> tabNome;
    
    private List<gerenteTabela> listGerente = new ArrayList<gerenteTabela>();

    private ObservableList<gerenteTabela> observableListgerente;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        carregarTable();
    }
    public void carregarTable(){

        // tabNome.setCellValueFactory(new PropertyValueFactory<String>("string"));
        // tabCargo.setCellValueFactory(new PropertyValueFactory<String>("string2"));
        // TabEmail.setCellValueFactory(new PropertyValueFactory<String>("string3"));
        // tabId.setCellValueFactory(new PropertyValueFactory<Integer>("i"));
        
        // gerenteTabela g1 = new gerenteTabela("null", "null", "null", 0);

        // listGerente.add(g1);
        observableListgerente = FXCollections.observableArrayList((listGerente));

        tabelaFuncionarios.setItems(observableListgerente);
    }

}
