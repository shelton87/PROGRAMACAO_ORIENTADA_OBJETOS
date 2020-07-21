package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class Infantil extends Produto {
	
	// Vari�veis
	private boolean eFralda;
	private boolean eLencoUmed;
	private boolean eBico;
	private boolean eMamadeira;
	
	// M�todos Get e Set
	public boolean iseFralda() {
		return eFralda;
	}
	public void seteFralda(boolean eFralda) {
		if(eFralda == true) {
			this.eFralda = eFralda;
			eLencoUmed = false;
			eBico = false;
			eMamadeira = false;
		}		
	}
	public boolean iseLencoUmed() {
		return eLencoUmed;
	}
	public void seteLencoUmed(boolean eLencoUmed) {
		if(eLencoUmed == true) {
			this.eLencoUmed = eLencoUmed;
			eFralda = false;
			eBico = false;
			eMamadeira = false;
		}		
	}
	public boolean iseBico() {
		return eBico;
	}
	public void seteBico(boolean eBico) {
		if(eBico == true) {
			this.eBico = eBico;
			eFralda = false;
			eLencoUmed = false;
			eMamadeira = false;
		}			
	}
	public boolean iseMamadeira() {
		return eMamadeira;
	}
	public void seteMamadeira(boolean eMamadeira) {
		if(eMamadeira == true) {
			this.eMamadeira = eMamadeira;
			eFralda = false;
			eLencoUmed = false;
			eBico = false;
		}			
	}
	
	// Informa��o Infantil
	public void informacao(Infantil produto) {
		JOptionPane.showMessageDialog(null,"\nNome: " + produto.getNome() +	"\nFabricante: " + produto.getFabricante() + 
			"\nData de validade: " + produto.getDataValidade() + "\nPre�o: " + produto.getPreco() +	"\nItem fralda: " + 
			produto.iseFralda() + "\nItem len�o umedecido: " + produto.iseLencoUmed() + "\nItem bico: " + produto.iseBico() + 
			"\nItem mamadeira: " + produto.iseMamadeira());
	}
}