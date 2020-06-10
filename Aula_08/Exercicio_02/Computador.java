package Exercicio_02;

public class Computador {
	
	private String nome;
	private float preco;
	private Processador cpu;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Processador getCpu() {
		return cpu;
	}
	public void setCpu(Processador cpu) {
		this.cpu = cpu;
	}
}

