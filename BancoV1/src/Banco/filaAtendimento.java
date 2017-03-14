package Banco;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class filaAtendimento {
	private LinkedList<Cliente> clientes = new LinkedList<Cliente>();
	private Cliente cliente;
    
        int cont;
        private Funcionario func;

	public void insereCliente(Cliente cliente) {
		clientes.add(cliente);
                cont =0;
            
	}

	public Cliente mostraLista() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println((clientes.get(i)).getNome() + ":" + ( clientes.get(i)).getIdade());
		}
		return cliente;
	}
        
        
 public int verificaIdade(){
      
        for(int i =0; i < clientes.size();i++){
          
           return i;
     
        }
         return 0;
 }
  
 
	public Cliente removeCliente() {
		Cliente aux = null;
		for (int i = 0; i < clientes.size(); i++) {
			
				aux = cliente;
				clientes.remove(i);
		}

		return aux;
	}

	public int tamanho() {
		return clientes.size();
	}

}
