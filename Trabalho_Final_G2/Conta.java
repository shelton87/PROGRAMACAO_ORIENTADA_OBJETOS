package Trabalho_Final_G2;

public class Conta {
	
	private String banco;
	private int agencia;
	private int numConta;
	
	//Construtor padrão
	public Conta() {		
	}
			
	//Construtor com parâmetro banco
	public Conta(String banco) {
		this.banco = banco;
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}	
}