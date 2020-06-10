package Atividade_Aula_06;

import javax.swing.JOptionPane;

public class Computador_Main {

	public static void main(String[] args) {
		
		// Obtendo informações do usuário
		String nome = JOptionPane.showInputDialog(null, "Informe o nome do computador: ");
		int clock = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o clock do computador: "));
		
		// Instanciando objeto
		Computador comp1 = new Computador(nome, clock);
		
		// Apresentando resultados
		JOptionPane.showMessageDialog(null, "Computador: " + comp1.getNome() + "\nClock: " + 
				comp1.getClock());		
		
	}

}
