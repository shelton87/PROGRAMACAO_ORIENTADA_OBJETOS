package Exercicio_03;

import javax.swing.JOptionPane;

public class Main_Boleto {

	public static void main(String[] args) {

		String numBoleto, valBoleto, nomeBoleto;
		
		Boleto boleto = new Boleto();
		
		// NÚMERO DO BOLETO
		while(true) {
			try {
				numBoleto =  JOptionPane.showInputDialog("Insira o número do boleto: ");
				boleto.setNumeroBoleto(Integer.parseInt(numBoleto));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"ERRO: " + e.getMessage());
			}
		}
		
		// VALOR DO BOLETO
		while(true) {
			try {
				valBoleto =  JOptionPane.showInputDialog("Insira o valor do boleto: ");
				boleto.setValorBoleto(Float.parseFloat(valBoleto));				
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"ERRO: " + e.getMessage());
			}
		}
		
		// NOME DO BOLETO
		nomeBoleto = JOptionPane.showInputDialog("Insira o nome do sacado do boleto: ");
		boleto.setSacado(nomeBoleto);
		
		// PROMPT
		JOptionPane.showMessageDialog(null, "Número Boleto: " + boleto.getNumeroBoleto() + 
				"\nValor Boleto: " + boleto.getValorBoleto() + "\nSacado: " + 
				boleto.getSacado());
	}

}
