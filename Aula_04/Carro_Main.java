package Atividade;

import javax.swing.JOptionPane;

public class Carro_Main {

	public static void main(String[] args) {
		
		String nome;
		int potencia;
		
		Carro popular = new Carro();
		
		nome = JOptionPane.showInputDialog(null, "Digite o nome do carro: ");
		popular.setNome(nome);
		potencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a potência do carro: "));
		popular.setPotencia(potencia);

		JOptionPane.showMessageDialog(null, "Carro: " + popular.getNome() + "\nPotência: " + 
				popular.getPotencia());	
		
	}

}
