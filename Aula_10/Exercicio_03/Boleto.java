package Exercicio_03;

public class Boleto {
	
	private float valorBoleto;
	private String sacado;
	private int numeroBoleto;
	
	public float getValorBoleto() {
		return valorBoleto;
	}
	public void setValorBoleto(float valorBoleto) {
		if (valorBoleto < 0) {
			throw new IllegalArgumentException("Valor do boleto negativo.");
		}
		this.valorBoleto = valorBoleto;
	}
	public String getSacado() {
		return sacado;
	}
	public void setSacado(String sacado) {
		this.sacado = sacado;
	}
	public int getNumeroBoleto() {
		return numeroBoleto;
	}
	public void setNumeroBoleto(int numeroBoleto) {
		if (numeroBoleto < 0) {
			throw new IllegalArgumentException("Número do boleto negativo.");
		}
		this.numeroBoleto = numeroBoleto;
	}
	
}
