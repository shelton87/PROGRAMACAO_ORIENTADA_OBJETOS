package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class Cosmetico extends Produto {
	
	// Vari�veis
	private boolean eHidratante;
	private boolean eMaquiagem;
	private boolean eEsmalte;
	private boolean eTintaCabelo;
	
	// M�todos Get e Set
	public boolean iseHidratante() {
		return eHidratante;
	}
	public void seteHidratante(boolean eHidratante) {
		if(eHidratante == true) {
			this.eHidratante = eHidratante;
			eMaquiagem = false;
			eEsmalte = false;
			eTintaCabelo = false;
		}		
	}
	public boolean iseMaquiagem() {
		return eMaquiagem;
	}
	public void seteMaquiagem(boolean eMaquiagem) {
		if(eMaquiagem == true) {
			this.eMaquiagem = eMaquiagem;
			eHidratante = false;
			eEsmalte = false;
			eTintaCabelo = false;
		}		
	}
	public boolean iseEsmalte() {
		return eEsmalte;
	}
	public void seteEsmalte(boolean eEsmalte) {
		if(eEsmalte == true) {
			this.eEsmalte = eEsmalte;
			eHidratante = false;
			eMaquiagem = false;
			eTintaCabelo = false;
		}
		
	}
	public boolean iseTintaCabelo() {
		return eTintaCabelo;
	}
	public void seteTintaCabelo(boolean eTintaCabelo) {
		if(eTintaCabelo == true) {
			this.eTintaCabelo = eTintaCabelo;
			eHidratante = false;
			eMaquiagem = false;
			eEsmalte = false;
		}		
	}
	
	// Informa��o Cosm�tico
	public void informacao(Cosmetico produto) {
		JOptionPane.showMessageDialog(null,"\nNome: " + produto.getNome() +	"\nFabricante: " + produto.getFabricante() + 
			"\nData de validade: " + produto.getDataValidade() + "\nPre�o: " + produto.getPreco() +	"\nHidratante: " + 
			produto.iseHidratante() + "\nMaquiagem: " + produto.iseMaquiagem() + "\nEsmalte: " + produto.iseEsmalte() + 
			"\nTinta p/ cabelo: " + produto.iseTintaCabelo());	
	}
}