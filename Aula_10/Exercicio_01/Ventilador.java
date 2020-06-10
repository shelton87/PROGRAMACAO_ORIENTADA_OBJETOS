package Exercicio_01;

public class Ventilador {
	
	private String nome, marca;
	private int potencia;
	
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
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		if (potencia < 0) {
			throw new IllegalArgumentException("Potência Inválida");
		}
		this.potencia = potencia;		
	}
}
