package Trabalho_Final_G2;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String CEP;
	
	//Construtor padrão
	public Endereco() {		
	}
		
	//Construtor com parâmetro logradouro
	public Endereco(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}

}
