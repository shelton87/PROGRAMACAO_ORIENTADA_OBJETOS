package Atividade_Aula_06;

public class Produto {
	
	// Atributos
	private String nome, descricao;
	private float preco;
	
	// Construtor Padrão
	public Produto() {		
	}
	
	// Construtor 1
	public Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	// Construtor 2
	public Produto(String nome, float preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	// Métodos GET / SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}	

}
