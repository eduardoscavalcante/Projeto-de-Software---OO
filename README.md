# Sistema para Gerenciamento de Estoque

## Equipe:

    Eduardo Serpa Cavalcante
    Lilian Fabrício Marques Neves
    Lucas Arthur Ribeiro Mascarenhas
    Matheus Feitosa Ramos
    Ronaldo Cândido dos Santos 
    
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Visão Geral do Sistema

O sistema de gerenciamento de estoque objetiva o gerenciamento de produtos de uma loja de departamento. Essa loja de departamento vende produtos dos tipos: roupas (feminina, masculina e infantil), calçados, artigos de casa, acessórios, eletrônicos e perfumes. 

    (i) identificação;
    (ii) especificação;
    (iii) tamanho;
    (iv) cor;
    (v) marca;
    (vi) preço;
    (vii) tipo
    (viii) categoria
    (ix) fabricante;
    (x) fornecedor;

Cada atividade possui as seguintes informações:

    (i) item;
    (ii) localidade;
    (iii) movimentação;
    (iv) data de entrada;
    (v) data de saída;
    (vi) Quantidade disponível.

## Requisitos Funcionais

   
| Func.  | Título | Descrição   |
| ------ | ------ | ----------- |
| 1  | Produtos | Permitir a criação e remoção de informações referentes aos produtos, movimentações e funcionários/responsáveis; Permitir que novos produtos adicionados tenham como base uma classe master com o método - Polimorfismo   |
| 2  | Informações do produto | Permitir a edição de informações referentes aos produtos, movimentações e funcionários/responsáveis; As informações dos produtos precisam ter um serial(id) de identificação que está integrado com a classe abstrata do produto - Interface   |
| 3  | Localidade do produto | Permitir a associação de produto a uma localidade do estoque   |
| 4  | Alteração dos status | “Em estoque”, “Sem estoque”, “quantidade” etc.   |
| 5  | Consultar produtos | Permitir consultas de informações;   |
| 6  | Relatório dos produtos | O sistema deve fornecer um relatório de entrada, saída do produto   |
| 7  | Gerenciamento de Usuários | Cadastro de usuário como uma classe base, e as classes derivadas (quais os tipos de usuário); - Herança O sistema deve permitir o intercâmbio de usuários entre lojas para realização de get.   |
| 8  | Gerenciamento de pagamentos | O sistema deve suportar o gerenciamento de pagamento dos produtos   |
| 9  | Controle de acessos | O sistema deve suportar controle de acesso através de usuário e senha com possibilidade para recuperação de senha;   |
| 10  | Undo/redo | Permitir operações de undo e redo de informações referentes aos produtos,movimentações e funcionários/responsáveis.   |

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Classes

    App
    
        # Funções: 
        
        main;
        
        startOptions: Função de Apoio para main:
        
                        Input dos Dados
        
        msgErroOpcoes: Tratamento de Erro de Entrada: 
        
                        Opção Inválida
        
        msgErroDados: Tratamento de Erro de Entrada: 
        
                        Tipo de Dado Inválido
    
    
    Base (Interface)
        
        # Funções:
        
        M_Inicial: Função de Apoio para editar;
        
        adicionar: Adição de Dados;
        
        editar: Alterar Detalhes dos Dados Cadastrados;
        
        imprimir: Impressão dos Dados.
    
    
    Funcionarios (Classe Abstrata/Superclasse)
    
        # Construtor: Funcionarios(int id, String nome, String email, long telefone, long cpf, int cargo).
        
        # Funções: 
        
        imprimir (Metodo Abstrato): Impressão dos Dados de um Funcionario;
    
        M_Inicial: Função de Apoio para editar;
    
        editar: Alterar Detalhes de um Funcionario.
    
    
    Gerenciamento (Array List - Produtos)
    
        # Funções: 
        
        adicionarProdutos: Adição de um Produto no Array List;
        
        imprimirProdutos: Percorrer o Array List Imprimindo as Informações de cada Produto;
        
        editarProdutos: Encontra o ID Desejado no Array List para Alterar Detalhes de um Produto;
        
        removerProduto: Encontra o ID Desejado no Array List para Remoção de um Produto;
        
        correcaoId: Checa se o ID do Novo Produto ja se Encontra no Array List antes de Adiciona-lo.
    
    
    GerenciamentoFuncionarios (Array List - Funcionarios)
    
        # Funções:
        
        imprimirFuncionarios: Percorrer o Array List Imprimindo as Informações de cada Tipo de Funcionario;
        
        editarFuncionarios: Encontra o ID Desejado no Array List para Alterar Detalhes de um Funcionario;
        
        removerfuncionarios: Encontra o ID Desejado no Array List para Remoção de um Funcionario;
        
        correcaoId: Checa se o ID do Novo Funcionario ja se Encontra no Array List antes de Adiciona-lo;
        
        M_Inicial: Função de Apoio para gerenciamentoCargo;
        
        gerenciamentoCargo: Adição de um Novo Funcionario baseado no Tipo do Funcionario no Array List.
    
    
    GerenciamentoMovimentacao (Array List - Movimentação)
    
        # Funções:
        
        adicionarMovimentacao: Adição de uma Movimentação no Array List;
        
        imprimirMovimentacao: Percorrer o Array List Imprimindo as Informações de cada Movimentação;
        
        editarMovimentacao: Encontra o ID Desejado no Array List para Alterar Detalhes de uma Movimentação;
        
        correcaoId: Checa se o ID da Nova Movimentação ja se Encontra no Array List antes de Adiciona-la.
        
    
    Gerente (Subclasse de Funcionarios)
    
        # Construtor: Gerente(int id, String nome, String email, long telefone, long cpf, int cargo, int pesSuperv).
        
        # Funções:  
        
        getpessoasSupervisionadas: Retorna o Valor da Quantidade de Pessoas Supervisionadas daquele Gerente;
    
        imprimir (Sobrescrita de Metodo): Impressão dos Dados de um Gerente.
    
    
    Login
    
        # Funções: 
        
        add_login: Função para Cadastrar Novo Login;
        
        recSenha(): Função para Recuperar Senha;
        
        acesso() Função para Acessar o Sistema.
        
        
    Movimentacao (Implementa Base)
    
        # Funções: 
        
        imp_m: Impressão dos Dados de uma Movimentação;
    
        add_m: Adição de uma Movimentação;
    
        CategoriaProduto: Função de Apoio para add_m e ed_m;
    
        M_Inicial: Função de Apoio para ed_m;
    
        ed_m: Alterar Detalhes de uma Movimentação.


    Produto
    
        # Funções: 
        
        add_produto: Adição de um Produto;
        
        remover_produto: Remoção de um Produto;
        
        M_Inicial: Função de Apoio para editar_produto;
        
        editar_produto: Alterar Detalhes de um Produto.
        
        
    Pagamento
    
        # Funções: 
        
        setAtriCCred: Função para Atributos do Cartão de Credito;
        
        setAtriCDeb: Função para Atributos do Cartão de Debito;
        
        M_Inicial: Função de Apoio para setPagamento;
        
        setPagamento: Função Principal para Pagamentos.
        
        

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Atualizações (08/03):
Adição de Herança, Polimorfismo e Interface nas funcionalidades do projeto.

Funcionalidades feitas:
-Interface para imprimir, adicionar e editar na classe de funcionários, produtos e movimentações.
-Herança feita para o cadastro dos funcionários.
-Polimorfismo para as classes de funcionários para gerenciar cargos e permissões.
