package Exercicio_07;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Ingresso_BackStage ingresso1 = new Ingresso_BackStage();		
		ingresso1.setValorIngresso(Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do "
				+ "ingresso BackStage: ")));
		
		Ingresso_Vip ingresso2 = new Ingresso_Vip();		
		ingresso2.setValorIngresso(Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do "
				+ "ingresso VIP: ")));
		
		Ingresso_Pista ingresso3 = new Ingresso_Pista();		
		ingresso3.setValorIngresso(Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do "
				+ "ingresso Pista: ")));
		
		ingresso1.mostraIngressos(ingresso1);
		ingresso2.mostraIngressos(ingresso2);
		ingresso3.mostraIngressos(ingresso3);

	}

}
