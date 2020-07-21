package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class HigienePessoal extends Produto {
	
	// Vari�veis
	private boolean eItemBanho;
	private boolean eItemBucal;
	private boolean ePapelHigienico;
	
	// M�todos Get e Set
	public boolean iseItemBanho() {
		return eItemBanho;
	}
	public void seteItemBanho(boolean eItemBanho) {
		if(eItemBanho == true) {
			this.eItemBanho = eItemBanho;
			eItemBucal = false;
			ePapelHigienico = false;
		}		
	}
	public boolean iseItemBucal() {
		return eItemBucal;
	}
	public void seteItemBucal(boolean eItemBucal) {
		if(eItemBucal == true) {
			this.eItemBucal = eItemBucal;
			eItemBanho = false;
			ePapelHigienico = false;
		}			
	}
	public boolean isePapelHigienico() {
		return ePapelHigienico;
	}
	public void setePapelHigienico(boolean ePapelHigienico) {
		if(ePapelHigienico == true) {
			this.ePapelHigienico = ePapelHigienico;
			eItemBanho = false;
			eItemBucal = false;
		}			
	}
	
	// Informa��o Higiene Pessoal
	public void informacao(HigienePessoal produto) {
		JOptionPane.showMessageDialog(null,"\nNome: " + produto.getNome() + "\nFabricante: " + produto.getFabricante() + 
			"\nData de validade: " +	produto.getDataValidade() + "\nPre�o: " + produto.getPreco() + "\nItem banho: " + 
			produto.iseItemBanho() + "\nItem bucal: " + produto.iseItemBucal() + "\nPapel Higi�nico: " + produto.isePapelHigienico());	
	}
}