package Exercicio_04;

import javax.swing.JOptionPane;

public class Main_Quadrado {

	public static void main(String[] args) {

		String valor;
		
		Quadrado quadrado = new Quadrado();
		
		valor = JOptionPane.showInputDialog("Insira um valor para calcular o quadrado dele: ");

		JOptionPane.showMessageDialog(null, "Resultado: " + 
				quadrado.calcular(Float.parseFloat(valor)));
	}

}
