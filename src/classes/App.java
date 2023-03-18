package classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    Scanner input = new Scanner(System.in);
    Produtos produto = new Produtos();
    Funcionarios funcionario = new Funcionarios();
    Movimentacao mov = new Movimentacao();
    Pagamento pag = new Pagamento();
    Login log = new Login();

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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Produtos produto = new Produtos();
        Funcionarios funcionario = new Funcionarios();
        Movimentacao mov = new Movimentacao();
        Pagamento pag = new Pagamento();
        Login log = new Login();

        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("* SISTEMA DE GERENCIAMENTO DE ESTOQUE *");
        System.out.println("*                                     *");
        System.out.println("***************************************");
        System.out.println();

        int option = startOptions();

        while(option != 0){ // enquanto não for dado o comando de parar o programa
            int indice = 1;
            switch(option){
                case 1: // adiciona novo produto
                    System.out.println();
                    produto.adicionar(indice);
                    System.out.println();
                    option = startOptions();
                    break;
                case 2: //adiciona novo funcionário
                    System.out.println();
                    funcionario.adicionar(indice);
                    System.out.println();
                    option = startOptions(); 
                    break;
                case 3: //edita produto existente
                    System.out.println();
                    //ArrayList<Colaborador> autores = new ArrayList<Colaborador>(); // autores de uma publicacao
                    //newProdAcad(colaboradores, autores, professores, alunos);
                    produto.editar();
                    System.out.println();
                    option = startOptions(); 
                    break;
                case 4: //edita funcionário existente
                    System.out.println();
                    //editProjeto(projetos, colaboradores);
                    funcionario.editar();
                    System.out.println();
                    option = startOptions(); 
                    break;
                case 5: //remove produto existente
                    System.out.println();
                    //Colaborador.queryColaborador(colaboradores);
                    produto.remover_produto();
                    System.out.println();
                    option = startOptions(); 
                    break;
                case 6: // remove funcionario existente
                    System.out.println();
                    //Projeto.queryProjeto(projetos);
                    funcionario.rem_e();
                    System.out.println();
                    option = startOptions(); 
                    break;
                case 7: // realiza uma movimentação de estoque
                    System.out.println();
                    //Relatorio relatorio = new Relatorio();
                    //relatorio.relatorio();
                    mov.adicionar(indice);
                    System.out.println();
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
                        log.acesso();
                    } else {
                        log.add_login();
                    }
                    System.out.println();
                    option = startOptions();
                    break;
                case 10: // Relatório
                    System.out.println();
                    produto.imprimir();
                    mov.imprimir();
                    funcionario.imprimir();
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
}

