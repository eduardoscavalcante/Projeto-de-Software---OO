package controller;
import classes.*;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class controllerP implements Initializable{

    Produtos produto = new Produtos();
    Movimentacao mov = new Movimentacao();
    Pagamento pag = new Pagamento();
    //Login log = new Login(); Retirar o comentario quando ajeitar a classe Login
    Gerenciamento gp = new Gerenciamento(); //onde está a lista
    GerenciamentoFuncionarios gf = new GerenciamentoFuncionarios();
    GerenciamentoMovimentacao gm = new GerenciamentoMovimentacao();

    private String[] opcao_funcionario_produto = {"Adicionar","Editar","Remover"};
    private String[] opcao_movimentacao = {"Movimentação","Pagamento","Login"};
    @FXML
    private ComboBox<String> combProduto;


    @FXML
    private ComboBox<String> combFuncionario;

    @FXML
    private ComboBox<String> combMov;

    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		combProduto.getItems().addAll(opcao_funcionario_produto);
        combFuncionario.getItems().addAll(opcao_funcionario_produto);
        combMov.getItems().addAll(opcao_movimentacao);
		
	}
    public void acao_produto(ActionEvent event) {

		String acaoP = combProduto.getValue();
        if (acaoP == "Adicionar"){
            App.changeScreen("adcionar_produto");
        }
        else if (acaoP == "Editar"){
            // gp.editarProdutos();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Titulo");
            alert.setHeaderText("ID INVALIDO!");
            alert.show();
            //App.changeScreen("editar_produto");
        }
        else if (acaoP == "Remover"){
            App.changeScreen("remover_produto");
            //gp.removerProduto();
        }
    }
    public void acao_funcionario(ActionEvent event) {

        String acaoF = combFuncionario.getValue();
        if (acaoF == "Adicionar"){
            // funcionario.adicionar();
            // gf.adicionarFuncionarios(funcionario);
            // funcionario = new Funcionarios();
        }
        else if (acaoF == "Editar"){
            //gf.editarFuncionarios();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Titulo");
            alert.setHeaderText("ID INVALIDO!");
            alert.show();
        }
        else if (acaoF == "Remover"){
            App.changeScreen("remover_funcionario");
            //gf.removerfuncionarios();
        }
    }
    public void acao_outros(ActionEvent event) {

        String acaoO = combMov.getValue();
        if (acaoO == "Movimentação"){
            // mov.adicionar();
            // gm.adicionarMovimentacao(mov);
            // mov = new Movimentacao();
        }
        else if (acaoO == "Pagamento"){
            //pag.setPagamento();
        }
        else if (acaoO == "Login"){
            // gp.imprimirProdutos(); //imprime as informações de todos os produtos existentes
            // gm.imprimirMovimentacao();
            // gf.imprimirFuncionarios();
        }
    }
    public void gerar_relatorio(ActionEvent event) {
        // gp.imprimirProdutos(); //imprime as informações de todos os produtos existentes
        // gm.imprimirMovimentacao();
        // gf.imprimirFuncionarios();
    }
    public void encerrar(ActionEvent event) {
        // gp.imprimirProdutos(); //imprime as informações de todos os produtos existentes
        // gm.imprimirMovimentacao();
        // gf.imprimirFuncionarios();
    }
    public void relatorio(ActionEvent event) {
        gp.imprimirProdutos(); //imprime as informações de todos os produtos existentes
        gm.imprimirMovimentacao();
        gf.imprimirFuncionarios();
        System.out.println("ta fucionando");
    }

}
