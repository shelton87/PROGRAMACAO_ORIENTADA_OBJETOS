package Atividade;

import javax.swing.JOptionPane;

public class Telefone_Main {

	public static void main(String[] args) {
		
		Telefone nokia = new Telefone();
		
		nokia.setNumeroTelefone(JOptionPane.showInputDialog(null, "Digite o número do telefone 1: "));
		nokia.setOperadora(JOptionPane.showInputDialog(null, "Digite a operadora do telefone 1: "));
		
		Telefone cce = new Telefone();
		
		cce.setNumeroTelefone(JOptionPane.showInputDialog(null, "Digite o número do telefone 2: "));
		cce.setOperadora(JOptionPane.showInputDialog(null, "Digite a operadora do telefone 2: "));
		
		JOptionPane.showMessageDialog(null, "Telefone 1\nNúmero: " + nokia.getNumeroTelefone() +
				"\nOperadora: " + nokia.getOperadora() + "\n\nTelefone 2\nNúmero: " + 
				cce.getNumeroTelefone() + "\nOperadora: " + cce.getOperadora());		
		
	}

}
