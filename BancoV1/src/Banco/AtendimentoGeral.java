package Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class AtendimentoGeral {

    public static void main(String[] args) {
        


        filaAtendimento filaClientes = new filaAtendimento();
        Atendimento atendimento = new Atendimento();
        
        
            int contador =1;
            int ci =1;
        while(ci > 0){
             int status = 0;
            Scanner le = new Scanner(System.in);
            
            System.out.println("Informe seu nome: ");
            String nomeFunc = le.nextLine();
            System.out.println("Informe sua idade: ");
            int idadeFunc = le.nextInt();
            
             Scanner le2 = new Scanner(System.in);
            System.out.println("Informe o guichê que irá operar: ");
            String guiche = le2.nextLine();
           System.out.println(" _____________________________________ ");
            
            
            Funcionario func = new Funcionario(nomeFunc, idadeFunc, guiche, status);
            atendimento.adicionaFunc(func);
            
            System.out.println("Para se cadastrar digite 1, para sair do sistema digite 0: ");
             ci = le.nextInt();
            atendimento.mostraLista();
           
        }    
            
            
            
            while (contador > 0 ) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Informe o seu nome: ");
            String nome = leitura.nextLine();
                 

            System.out.println("Informe a sua idade: ");
            int idade = leitura.nextInt();
           
            int numFicha = 0;
            numFicha++;
            System.out.println(" _____________________________________ ");
            
            Cliente cl = new Cliente(nome, idade, numFicha);
            filaClientes.insereCliente(cl);
            
            
            System.out.println("Para se cadastrar digite 1, para sair do sistema digite 0: ");
            contador= leitura.nextInt();
            } 
            
            
                    
           
            
            
        
       // filaClientes.mostraLista();
        
        
       /* System.out.println(filaClientes.tamanho());

        filaClientes.removeCliente();
        System.out.println(filaClientes.tamanho()); */

    }

}
