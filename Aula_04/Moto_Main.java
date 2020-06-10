package Atividade;

import javax.swing.JOptionPane;

public class Moto_Main {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis
		int potencia1, potencia2, peso1, peso2;
		
		// Declara��o do objeto "moto1"
		Moto moto1 = new Moto();
		
		moto1.setNome(JOptionPane.showInputDialog(null, "Digite o nome da 1� moto: "));
		moto1.setMarca(JOptionPane.showInputDialog(null, "Digite a marca: "));
		
		// Inser��o - Pot�cia
		do {
			potencia1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a pot�ncia da moto: "));
			if (potencia1 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO");
			} else {
				moto1.setPotencia(potencia1);
			}
		} while (potencia1 < 0);
		
		// Inser��o - Peso
		do {
			peso1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da moto: "));
			if (peso1 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO");
			} else {
				moto1.setPeso(peso1);
			}
		} while (peso1 < 0);
		
		// Declara��o do objeto "moto2"
		Moto moto2 = new Moto();
				
		moto2.setNome(JOptionPane.showInputDialog(null, "Digite o nome da 2� moto: "));
		moto2.setMarca(JOptionPane.showInputDialog(null, "Digite a marca: "));
			
		// Inser��o - Pot�cia
		do {
			potencia2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a pot�ncia da moto: "));
			if (potencia2 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO");
			} else {
				moto2.setPotencia(potencia2);
			}
		} while (potencia2 < 0);
		
		// Inser��o - Peso		
		do {
			peso2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da moto: "));
			if (peso2 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO");
			} else {
				moto2.setPeso(peso2);
			}
		} while (peso2 < 0);
		
		// Apresenta��o dos resultados
		JOptionPane.showMessageDialog(null, "APRESENTA��O - MOTOS\n\nNome: " + moto1.getNome() + 
				"\nMarca: " + moto1.getMarca() + "\nPot�ncia: " + moto1.getPotencia() + 
				"\nPeso: " + moto1.getPeso() + "\n\nNome: " + moto2.getNome() + "\nMarca: " + 
				moto2.getMarca() + "\nPot�ncia: " + moto2.getPotencia() + "\nPeso: " + 
				moto2.getPeso());
		
	}

}
