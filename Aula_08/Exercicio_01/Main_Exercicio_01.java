package Exercicio_01;

public class Main_Exercicio_01 {

	public static void main(String[] args) {

		Casa casa = new Casa();		
		Porta porta1 = new Porta();
		Porta porta2 = new Porta();		
		Janela janela1 = new Janela();		
		Janela janela2 = new Janela();
		
		casa.setTamanhoEmMetros(55);
		casa.setPorta1(porta1);
		casa.setPorta2(porta2);
		casa.setJanela1(janela1);
		casa.setJanela2(janela2);		
		
		porta1.setCor("branco");
		porta1.setTamanho(2);		
		porta2.setCor("marrom");
		porta2.setTamanho(2);	
		
		janela1.setTamanho(4);
		janela2.setTamanho(3);
		
		System.out.println("A casa possui " + casa.getTamanhoEmMetros() + " metros quadrados.");
		System.out.println("Com uma porta na cor " + casa.getPorta1().getCor() + " e com " +
				casa.getPorta1().getTamanho() + " metros de altura.");
		System.out.println("E a outra porta na cor " + casa.getPorta2().getCor() + " e com " +
				casa.getPorta2().getTamanho() + " metros de altura.");
		System.out.println("Possui também duas janelas, uma com " + casa.getJanela1().getTamanho()
				+ " metros e outra com " + casa.getJanela2().getTamanho() + " metros.");		
	}

}
