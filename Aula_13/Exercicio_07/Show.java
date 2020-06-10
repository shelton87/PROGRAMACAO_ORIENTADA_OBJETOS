package Exercicio_07;

import javax.swing.JOptionPane;

public class Show {
	
	// Variáveis
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
	
	// Visualização do valor e descrição do ingresso
	public void mostraIngressos(Show ingresso) {
		String info = "\nValor do ingresso: " + ingresso.getValorIngresso() + "\nDescrição: " + 
				ingresso.getDescricaoIngresso();
		JOptionPane.showMessageDialog(null, info);
	}
	

}
