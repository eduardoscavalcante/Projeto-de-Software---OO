package classes;

import java.util.InputMismatchException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//import teste.CadastroProduto;

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

        return opt; // opção selecionada
    }

    public static void main(String[] args) throws Exception{

        launch (args);

        Scanner input = new Scanner(System.in);
        Produtos produto = new Produtos();
        Movimentacao mov = new Movimentacao();
        Pagamento pag = new Pagamento();
        //Login log = new Login(); Retirar o comentario quando ajeitar a classe Login

        Gerenciamento gp = new Gerenciamento(); //onde está a lista
        GerenciamentoFuncionarios gf = new GerenciamentoFuncionarios();
        GerenciamentoMovimentacao gm = new GerenciamentoMovimentacao();

        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("* SISTEMA DE GERENCIAMENTO DE ESTOQUE *");
        System.out.println("*                                     *");
        System.out.println("***************************************");
        System.out.println();

        int option = startOptions();

        while(option != 0){ // enquanto não for dado o comando de parar o programa
            switch(option){
                case 1: // adiciona novo produto
                    System.out.println();
                    produto.adicionar();
                    System.out.println();
                    gp.correcaoId(produto);
                    gp.adicionarProdutos(produto);
                    produto = new Produtos();
                    option = startOptions();
                    break;
                case 2: //adiciona novo funcionário
                    System.out.println();
                    gf.gerenciamentoCargo();
                    System.out.println();
                    option = startOptions();
                    break;
                case 3: //edita produto existente
                    System.out.println();
                    gp.editarProdutos();
                    System.out.println();
                    option = startOptions();
                    break;
                case 4: //edita funcionário existente
                    System.out.println();
                    gf.editarFuncionarios();
                    System.out.println();
                    option = startOptions();
                    break;
                case 5: //remove produto existente
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
                    mov.adicionar();
                    System.out.println();
                    gm.correcaoId(mov);
                    gm.adicionarMovimentacao(mov);
                    mov = new Movimentacao();
                    option = startOptions();
                    break;
                case 8: // Realizar Pagamento
                    System.out.println();
                    pag.setPagamento();
                    System.out.println();
                    option = startOptions();
                    break;
                case 9: // Realizar Login
                    System.out.println();
                    System.out.println("Ja possui cadastro?");
                    String aux;
                    aux = input.nextLine();
                    if (aux.equals("sim")) {
                        //log.acesso(); Retirar o comentario quando ajeitar a classe Login
                    } else {
                        //log.add_login(); Retirar o comentario quando ajeitar a classe Login
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
                    gp.imprimirProdutos(); //imprime as informações de todos os produtos existentes
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
    // Navegando entre as telas
    private static Stage stage;
    private static Scene tela1;
    private static Scene tela2;
    private static Scene id_invalido;
    private static Scene remover;

    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

            //tela principal
        FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/view/tela_inicial.fxml"));
        Parent root1 = fxmlLoader1.load();
        tela1 = new Scene(root1);
            //tela de adicionar produto
        FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("/view/add_produto.fxml"));
        Parent root2 = fxmlLoader2.load();
        tela2 = new Scene(root2);
            //Id invalido
        FXMLLoader fxmlLoader3 = new FXMLLoader(getClass().getResource("/view/sem_id.fxml"));
        Parent root3 = fxmlLoader3.load();
        id_invalido = new Scene(root3);
            //remove 
        FXMLLoader fxmlLoader4 = new FXMLLoader(getClass().getResource("/view/remove.fxml"));
        Parent root4 = fxmlLoader4.load();
        remover = new Scene(root4);

        primaryStage.setTitle("Sistema de gerenciamento de produtos");
        primaryStage.setScene(tela1);
        primaryStage.show();


    }
    //escolhndo telas
    public static void changeScreen(String scr){
        switch(scr){
            case "main":
                stage.setScene(tela1);
                break;
            case "adcionar_produto":
                stage.setScene(tela2);
                break;
            case "editar_produto":
                stage.setScene(id_invalido);
            case "remover_produto":
                stage.setScene(remover);
            case "remover_funcionario":
                stage.setScene(remover);
        }
    }
}
