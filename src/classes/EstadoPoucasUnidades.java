package classes;

import java.util.Scanner;

public class EstadoPoucasUnidades extends Produtos implements Estado{

    public String status;

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public void adicionar(){
        super.adicionar ();
        if(super.getQuantidade() <= 50){
            setStatus("Poucas Unidades");//EstadoPoucasUnidades
        }
    }
}
