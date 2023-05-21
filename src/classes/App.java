package classes;

import java.util.InputMismatchException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    Scanner input = new Scanner(System.in);

    public static void msgErroDados() {
        System.err.println("Dados informados incorretamente! Por favor, informe os dados corretamente.");
    }

    public static void msgErroOpcoes() {
        System.err.println("Por favor, selecione uma das opções válidas.");
    }

    public static int startOptions() {
        Scanner op = new Scanner(System.in); // scanner da opção de entrada
        int opt = -1;

        System.out.println("****************OPÇÕES:****************");
        System.out.println("*  [1] Adicionar Produto              *");
        System.out.println("*  [2] Adicionar Funcionário          *");
        System.out.println("*  [3] Editar Produto                 *");
        System.out.println("*  [4] Editar Funcionário             *");
        System.out.println("*  [5] Remover Produto                *");
        System.out.println("*  [6] Remover Funcionário            *");
        System.out.println("*  [7] Realizar Movimentação          *");
        System.out.println("*  [8] Realizar Pagamento             *");
        System.out.println("*  [9] Realizar Login                 *");
        System.out.println("*  [10] Relatório Geral               *");
        System.out.println("*  [0] Encerrar programa              *");
        System.out.println("***************************************");
        System.out.print("Selecione a opção desejada: ");

        try {
            opt = op.nextInt();
        } catch (InputMismatchException error) {
            msgErroOpcoes();
            opt = startOptions();
        }

        return opt;
    }

    public static void main(String[] args) throws Exception{

        launch (args);

        Scanner input = new Scanner(System.in);
        Produtos produto = new Produtos();
        Movimentacao mov = new Movimentacao();
        Pagamento pag = new Pagamento();
        Login log = new Login();

        //Array_List
        Gerenciamento gp = new Gerenciamento();
        GerenciamentoFuncionarios gf = new GerenciamentoFuncionarios();
        GerenciamentoMovimentacao gm = new GerenciamentoMovimentacao();

        //State
        GerenciamentoEstado ge = new GerenciamentoEstado();

        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("* SISTEMA DE GERENCIAMENTO DE ESTOQUE *");
        System.out.println("*                                     *");
        System.out.println("***************************************");
        System.out.println();

        int option = startOptions();

        while(option != 0){
            switch(option){
                case 1: // adiciona novo produto
                    System.out.println();
                    try {
                        produto.adicionar();
                        //State
                        ge.verificaQuantidade(produto);
                        ge.adicionaProduto(produto);
                        //State
                        produto.imprimir();
                        //arraylist
                        gp.correcaoId(produto);
                        gp.adicionarProdutos(produto);
                        //arraylist
                    }catch(Exception e){
                        System.out.println("Ocorreu um Erro na Leitura de 1 ou + Dados!");
                    }
                    System.out.println();
                    produto = new Produtos();
                    option = startOptions();
                    break;
                case 2: // adiciona novo funcionário
                    System.out.println();
                    try {
                        //gf.gerenciamentoCargo();
                    }catch(Exception e){
                        System.out.println("Ocorreu um Erro na Leitura de 1 ou + Dados!");
                    }
                    System.out.println();
                    option = startOptions();
                    break;
                case 3: // edita produto existente
                    System.out.println();
                    gp.editarProdutos();
                    System.out.println();
                    option = startOptions();
                    break;
                case 4: // edita funcionário existente
                    System.out.println();
                    gf.editarFuncionarios();
                    System.out.println();
                    option = startOptions();
                    break;
                case 5: // remove produto existente
                    System.out.println();
                    gp.removerProduto();
                    System.out.println();
                    option = startOptions();
                    break;
                case 6: // remove funcionario existente
                    System.out.println();
                    gf.removerfuncionarios();
                    System.out.println();
                    option = startOptions();
                    break;
                case 7: // realiza uma movimentação de estoque
                    System.out.println();
                    try {
                        //mov.adicionar();
                        gm.correcaoId(mov);
                        gm.adicionarMovimentacao(mov);
                    }catch(Exception e){
                        System.out.println("Ocorreu um Erro na Leitura de 1 ou + Dados!");
                    }
                    System.out.println();
                    mov = new Movimentacao();
                    option = startOptions();
                    break;
                case 8: // Realizar Pagamento
                    System.out.println();
                    try{
                        pag.setPagamento();
                    }catch(Exception e){
                        System.out.println("Ocorreu um Erro na Leitura de 1 ou + Dados!");
                    }
                    System.out.println();
                    option = startOptions();
                    break;
                case 9: // Realizar Login
                    System.out.println();
                    System.out.println("Ja possui cadastro?");
                    String aux;
                    aux = input.nextLine();
                    if (aux.equals("sim")) {
                        log.acesso();
                    } else {
                        log.add_login();
                    }
                    System.out.println();
                    option = startOptions();
                    break;
                case 10: // Relatório
                    System.out.println();
                    System.out.println("*******************************************");
                    System.out.println("*           RELATÓRIO DO GERAL:           *");
                    System.out.println("*******************************************");
                    System.out.println();
                    gp.imprimirProdutos();
                    gm.imprimirMovimentacao();
                    gf.imprimirFuncionarios();
                    System.out.println();
                    option = startOptions();
                    break;
                default:
                    System.out.println("Selecione uma opção válida!");
                    option = startOptions();
                    break;
            }
        }
    }


    // implementa movimentações
    static GerenciamentoMovimentacao gm = new GerenciamentoMovimentacao();
    public static void dadosMovimentacao(int idMovimentacao, int idResponsavel, int idProduto, String origem, String destino, String data) throws Exception{
        Movimentacao mov = new Movimentacao();
        mov.adicionar(idMovimentacao, idResponsavel, idProduto, origem, destino, data);
        boolean idExistente = gm.correcaoId2(idMovimentacao);
        if (idExistente == false)gm.adicionarMovimentacao(mov);
        //System.out.println("Aqui começa");
        //gm.imprimirMovimentacao();
    }

    // implementando funcionarios
    static GerenciamentoFuncionarios gf = new GerenciamentoFuncionarios();
    public static void dadosFuncionario(int Identificação, long cpf, long telefone, int supOrMeta, String nome, String email, int aux) throws Exception{
        gf.gerenciamentoCargo(Identificação, cpf, telefone, supOrMeta, nome, email, aux);
        //System.out.println("**Aqui começa**");
        gf.imprimirFuncionarios();
    }

        //telas
    private static Stage stage;
    private static Scene telaHome;
    private static Scene telaProdutos;
    private static Scene telaAddProdutos;
    private static Scene telaEditProdutos;
    private static Scene telaRemoveProdutos;
    private static Scene telaFuncionarios;
    private static Scene telaAddFuncionarios;
    private static Scene telaEditFuncionarios;
    private static Scene telaRemoveFuncionario;
    private static Scene telaMovimentacao;
    private static Scene telaSelecionarFunc;
    private static Scene telaAddVendedor;
    private static Scene telaAddGerente;
    private static Scene telaAddMovimentacao;

    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

            //tela principal
        FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/view/home.fxml"));
        Parent root1 = fxmlLoader1.load();
        telaHome = new Scene(root1);
            //tela de produto
        FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("/view/produtos/produtos.fxml"));
        Parent root2 = fxmlLoader2.load();
        telaProdutos = new Scene(root2);
            //tela de adicionar produto 
        FXMLLoader fxmlLoader3 = new FXMLLoader(getClass().getResource("/view/produtos/add-produto.fxml"));
        Parent root3 = fxmlLoader3.load();
        telaAddProdutos = new Scene(root3);
            //tela de editar produto
        FXMLLoader fxmlLoader4 = new FXMLLoader(getClass().getResource("/view/produtos/editar-produto.fxml"));
        Parent root4 = fxmlLoader4.load();
        telaEditProdutos = new Scene(root4);
            //tela de remover produto
        FXMLLoader fxmlLoader5 = new FXMLLoader(getClass().getResource("/view/produtos/removeProduto.fxml"));
        Parent root5 = fxmlLoader5.load();
        telaRemoveProdutos = new Scene(root5);
            //tela de funcionarios
        FXMLLoader fxmlLoader6 = new FXMLLoader(getClass().getResource("/view/Funcionarios/funcionario.fxml"));
        Parent root6 = fxmlLoader6.load();
        telaFuncionarios = new Scene(root6);
            //tela de editar funcionario
        FXMLLoader fxmlLoader8 = new FXMLLoader(getClass().getResource("/view/Funcionarios/editar-funcionario.fxml"));
        Parent root8 = fxmlLoader8.load();
        telaEditFuncionarios = new Scene(root8);
            //tela de remover funcionario
        FXMLLoader fxmlLoader9 = new FXMLLoader(getClass().getResource("/view/Funcionarios/removeFuncionario.fxml"));
        Parent root9 = fxmlLoader9.load();
        telaRemoveFuncionario = new Scene(root9);
        //     //tela de movimentações
        FXMLLoader fxmlLoader10 = new FXMLLoader(getClass().getResource("/view/movimentacao/movimentacao.fxml"));
        Parent root10 = fxmlLoader10.load();
        telaMovimentacao = new Scene(root10);
            //tela de selecionar tipo de funcionario
        FXMLLoader fxmlLoader11 = new FXMLLoader(getClass().getResource("/view/Funcionarios/selecFuncionario.fxml"));
        Parent root11 = fxmlLoader11.load();
        telaSelecionarFunc = new Scene(root11);
            //tela de adicionar vendedor
        FXMLLoader fxmlLoader12 = new FXMLLoader(getClass().getResource("/view/Funcionarios/add-vendedor.fxml"));
        Parent root12 = fxmlLoader12.load();
        telaAddVendedor = new Scene(root12);
            //tela de adicionar gerente
        FXMLLoader fxmlLoader13 = new FXMLLoader(getClass().getResource("/view/Funcionarios/add-gerente.fxml"));
        Parent root13 = fxmlLoader13.load();
        telaAddGerente = new Scene(root13);
            //tela de adicionar movimentação
        FXMLLoader fxmlLoader14 = new FXMLLoader(getClass().getResource("/view/movimentacao/add-movimentacao.fxml"));
        Parent root14 = fxmlLoader14.load();
        telaAddMovimentacao = new Scene(root14);
        

        primaryStage.setTitle("Sistema de gerenciamento de produtos");
        primaryStage.setScene(telaHome);
        primaryStage.show();


    }
    //escolhndo telas
    public static void changeScreen(String scr){
        switch(scr){
            case "main":
                stage.setScene(telaHome);
                break;
            case "produto":
                stage.setScene(telaProdutos);
                break;
            case "add_produto":
                stage.setScene(telaAddProdutos);
                break;
            case "edit_produto":
                stage.setScene(telaEditProdutos);
                break;
            case "remove_produto":
                stage.setScene(telaRemoveProdutos);
                break;
            case "funcionario":
                stage.setScene(telaFuncionarios);
                break;
            case "edit_funcionario":
                 stage.setScene(telaEditFuncionarios);
                 break;
            case "remove_funcionario":
                stage.setScene(telaRemoveFuncionario);
                break;
            case "movimentacao":
                stage.setScene(telaMovimentacao);
                break;
            case "selecionar_funcionario":
                stage.setScene(telaSelecionarFunc);
                break;
            case "add_vendedor":
                stage.setScene(telaAddVendedor);
                break;
            case "add_gerente":
                stage.setScene(telaAddGerente);
                break;
            case "add_movimentacao":
                stage.setScene(telaAddMovimentacao);
        }
    }
}