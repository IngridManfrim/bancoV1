package Banco;

import java.util.ArrayList;

public class Atendimento {

    filaAtendimento fila = new filaAtendimento();
    ArrayList<Funcionario> atendimentoCaixa;

    public Atendimento() {
        atendimentoCaixa = new ArrayList<>();
    }

    public void adicionaFunc(Funcionario func) {
        atendimentoCaixa.add(func);
    }

    public boolean verificaGuiches() {
        if (atendimentoCaixa != null) {
            for (int i = 0; i < atendimentoCaixa.size(); i++) {
                if (atendimentoCaixa.get(i).getStatus() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        return atendimentoCaixa.size();
    }

    public void realizaAtendimento(Funcionario func) {
        
        if(atendimentoCaixa.size()!=0){
            for(int i =0; i < atendimentoCaixa.size(); i++){
                if(atendimentoCaixa.get(i).getStatus() == 0){
                    if (fila.verificaIdade()>=65)  {
                        atendimentoCaixa.add(func);
                }
                    if(fila.verificaIdade()<65){
                        atendimentoCaixa.add(func);
                    }
                }
                
            }
        }
        
        
    }
    
	public Funcionario mostraLista() {
		for (int i = 0; i < atendimentoCaixa.size(); i++) {
			System.out.println((atendimentoCaixa.get(i).getNome() + atendimentoCaixa.get(i).getGuiche()+ atendimentoCaixa.get(i).getStatus()));
		}
		return null;
	}
}



