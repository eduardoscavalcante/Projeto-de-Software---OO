package classes;

public class GerenciamentoEstado extends Produtos{

    public String status;

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public String verificaQuantidade(){
        if(super.getQuantidade() > 50){
            return "Disponivel";//EstadoDisponivel
        }else if(super.getQuantidade() <= 50){
            return "Poucas Unidades";//EstadoPoucasUnidades
        }else if(super.getQuantidade() == 0){
            return"Sem Estoque";//EstadoSemEstoque
        }
    }

    public void adicionar(){
        super.adicionar();
        setStatus(verificaQuantidade());
    }

    public void trocaEstado(){
        setStatus(verificaQuantidade());
    }
}