package Trabalho_Final_G2;

public class Produto {
	
	private String nome;
	private String fabricante;
	private String dataValidade;
	private float preco;
	
	//Construtor padr�o
	public Produto() {	
	}
		
	//Construtor com par�metro nome
	public Produto(String nome) {
		this.nome = (nome);
	}
	
	// M�todos Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
}