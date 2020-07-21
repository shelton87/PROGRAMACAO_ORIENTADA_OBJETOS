package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class Perfumaria extends Produto{
	
	// Variáveis
	private boolean eDesodorante;
	private boolean ePerfume;
	
	// Métodos Get e Set
	public boolean iseDesodorante() {
		return eDesodorante;
	}
	public void seteDesodorante(boolean eDesodorante) {
		if(eDesodorante == true) {
			this.eDesodorante = eDesodorante;
			ePerfume = false;
		}		
	}
	public boolean isePerfume() {
		return ePerfume;
	}
	public void setePerfume(boolean ePerfume) {
		if(ePerfume == true) {
			this.ePerfume = ePerfume;
			eDesodorante = false;
		}		
	}

	// Informação Perfumaria
	public void informacao(Perfumaria produto) {
		JOptionPane.showMessageDialog(null,"\nNome: " + produto.getNome() +	"\nFabricante: " + produto.getFabricante() + 
			"\nData de validade: " +	produto.getDataValidade() + "\nPreço: " + produto.getPreco() + "\nDesodorante: " + 
			produto.iseDesodorante() + "\nPerfume: " + produto.isePerfume());	
	}
}