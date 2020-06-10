package Exercicio_07;

import javax.swing.JOptionPane;

public class Show {
	
	// Vari�veis
	private float valorIngresso;
	private String descricaoIngresso;
	
	// Getters and Setters
	public float getValorIngresso() {
		return valorIngresso;
	}
	public void setValorIngresso(float valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	public String getDescricaoIngresso() {
		return descricaoIngresso;
	}
	public void setDescricaoIngresso(String descricaoIngresso) {
		this.descricaoIngresso = descricaoIngresso;
	}
	
	// Visualiza��o do valor e descri��o do ingresso
	public void mostraIngressos(Show ingresso) {
		String info = "\nValor do ingresso: " + ingresso.getValorIngresso() + "\nDescri��o: " + 
				ingresso.getDescricaoIngresso();
		JOptionPane.showMessageDialog(null, info);
	}
	

}
