package Exercicio_05;

import javax.swing.JOptionPane;

public class Main_Tempo {

	public static void main(String[] args) {
		
		Tempo temperaturaRS = new Tempo();
		Tempo temperaturaBahia = new Tempo();
		
		temperaturaRS.setTemperatura(18);
		temperaturaBahia.setTemperatura(26);
		
		JOptionPane.showMessageDialog(null, "No Rio Grande do Sul temperatura: " + 
		temperaturaRS.statusTempo() + ".\nNa Bahia temperatura: " + temperaturaBahia.statusTempo() +
		".");
		
	}
	
}
