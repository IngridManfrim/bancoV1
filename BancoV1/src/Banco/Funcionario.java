package Banco;

import java.util.ArrayList;
import java.util.LinkedList;

public class Funcionario extends Pessoa{
    private String guiche;
    private int status;
    
    
    public Funcionario(String nome, int idade, String guiche, int status) {
        super(nome, idade);
        this.guiche=guiche;
        this.status = status;
    }

    public String getGuiche() {
        return guiche;
    }

    public void setGuiche(String guiche) {
        this.guiche = guiche;
    }
    public int getStatus(){
        return status;
    }
    
   
     
    
    
}
 