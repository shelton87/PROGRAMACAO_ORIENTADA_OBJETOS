package Atividade_Aula_06;

public class Computador {
	
	// Atributos
	private String nome;
	private int clock;
	
	// Construtor Padrão
	public Computador() {		
	}
	
	// Construtor 1
	public Computador(String nome, int clock) {
		this.nome = nome;
		this.clock = clock;
	}
	
	// Métodos GET / SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getClock() {
		return clock;
	}
	public void setClock(int clock) {
		this.clock = clock;
	}	
		
}
