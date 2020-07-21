package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class SexyShop extends Produto {
	
	// Variáveis
	private boolean ePreseMasc;
	private boolean ePreseFem;
	private boolean eLubrificante;
	
	// Métodos Get e Set
	public boolean isePreseMasc() {
		return ePreseMasc;
	}
	public void setePreseMasc(boolean ePreseMasc) {
		if(ePreseMasc == true) {
			this.ePreseMasc = ePreseMasc;
			ePreseFem = false;
			eLubrificante = false;
		}		
	}
	public boolean isePreseFem() {
		return ePreseFem;
	}
	public void setePreseFem(boolean ePreseFem) {
		if(ePreseFem == true) {
			this.ePreseFem = ePreseFem;
			ePreseMasc = false;
			eLubrificante = false;
		}		
	}
	public boolean iseLubrificante() {
		return eLubrificante;
	}
	public void seteLubrificante(boolean eLubrificante) {
		if(eLubrificante == true) {
			this.eLubrificante = eLubrificante;
			ePreseMasc = false;
			ePreseFem = false;
		}		
	}
	
	// Informação Sexy Shop
	public void informacao(SexyShop produto) {
		JOptionPane.showMessageDialog(null,"\nNome: " + produto.getNome() + "\nFabricante: " + produto.getFabricante() + 
			"\nData de validade: " + produto.getDataValidade() + "\nPreço: " + produto.getPreco() +	"\nPreservativo Masc.: " + 
			produto.isePreseMasc() + "\nPreservativo " + "Fem.: " + produto.isePreseFem() + "\nLubrificante: "+ produto.iseLubrificante());	
	}
}