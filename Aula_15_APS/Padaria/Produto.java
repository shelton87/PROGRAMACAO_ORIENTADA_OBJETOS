package Padaria;

public class Produto {
	
	private String nome, marca;
	private float preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	// Escrever na tela o nome, preco e marca.
	public void descricao() {
		System.out.println("\nProduto: " + nome + "\nPreço: " + preco + "\nMarca: " + marca);
	}
}
