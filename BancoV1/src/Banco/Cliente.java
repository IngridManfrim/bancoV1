package Banco;




public class Cliente extends Pessoa{
	
	public int numFicha;

    public Cliente(String nome, int idade, int numFicha) {
        super(nome, idade);
        this.numFicha = numFicha;
    }

    public int getNumFicha() {
        return numFicha;
    }

    public void setNumFicha(int numFicha) {
        this.numFicha = numFicha;
    }
    
}


	
