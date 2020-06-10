package Exercicio_02;

public class Main_Casa {

	public static void main(String[] args) {
		
		Casa casa1 = new Casa();
		
		casa1.setEndereco("Rua Jorge Tadeu, nº10");
		casa1.setNumeroPortas(4);
		casa1.setNumeroJanelas(5);
		
		Casa casa2 = new Casa();
		
		casa2.setEndereco("Rua Jardel Filho, nº20");
		casa2.setNumeroPortas(8);
		casa2.setNumeroJanelas(6);

		Casa casa3 = new Casa();
		
		casa3.setEndereco("Av. Frederico Augusto Ritter, nº30");
		casa3.setNumeroPortas(5);
		casa3.setNumeroJanelas(6);
		
		System.out.println("A casa 1 está na " + casa1.getEndereco() + ",");
		System.out.println("e possui " + casa1.getNumeroPortas() + " portas ");
		System.out.println("e " + casa1.getNumeroJanelas() + " janelas.\n");
		
		System.out.println("A casa 2 está na " + casa2.getEndereco() + ",");
		System.out.println("e possui " + casa2.getNumeroPortas() + " portas ");
		System.out.println("e " + casa2.getNumeroJanelas() + " janelas.\n");
		
		System.out.println("A casa 3 está na " + casa3.getEndereco() + ",");
		System.out.println("e possui " + casa3.getNumeroPortas() + " portas ");
		System.out.println("e " + casa3.getNumeroJanelas() + " janelas.");
		
	}

}
