package Atividade;

import javax.swing.JOptionPane;

public class Moto_Main {

	public static void main(String[] args) {
		
		// Declaração das variáveis
		int potencia1, potencia2, peso1, peso2;
		
		// Declaração do objeto "moto1"
		Moto moto1 = new Moto();
		
		moto1.setNome(JOptionPane.showInputDialog(null, "Digite o nome da 1ª moto: "));
		moto1.setMarca(JOptionPane.showInputDialog(null, "Digite a marca: "));
		
		// Inserção - Potêcia
		do {
			potencia1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a potência da moto: "));
			if (potencia1 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO");
			} else {
				moto1.setPotencia(potencia1);
			}
		} while (potencia1 < 0);
		
		// Inserção - Peso
		do {
			peso1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da moto: "));
			if (peso1 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO");
			} else {
				moto1.setPeso(peso1);
			}
		} while (peso1 < 0);
		
		// Declaração do objeto "moto2"
		Moto moto2 = new Moto();
				
		moto2.setNome(JOptionPane.showInputDialog(null, "Digite o nome da 2ª moto: "));
		moto2.setMarca(JOptionPane.showInputDialog(null, "Digite a marca: "));
			
		// Inserção - Potêcia
		do {
			potencia2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a potência da moto: "));
			if (potencia2 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO");
			} else {
				moto2.setPotencia(potencia2);
			}
		} while (potencia2 < 0);
		
		// Inserção - Peso		
		do {
			peso2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da moto: "));
			if (peso2 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO");
			} else {
				moto2.setPeso(peso2);
			}
		} while (peso2 < 0);
		
		// Apresentação dos resultados
		JOptionPane.showMessageDialog(null, "APRESENTAÇÃO - MOTOS\n\nNome: " + moto1.getNome() + 
				"\nMarca: " + moto1.getMarca() + "\nPotência: " + moto1.getPotencia() + 
				"\nPeso: " + moto1.getPeso() + "\n\nNome: " + moto2.getNome() + "\nMarca: " + 
				moto2.getMarca() + "\nPotência: " + moto2.getPotencia() + "\nPeso: " + 
				moto2.getPeso());
		
	}

}
