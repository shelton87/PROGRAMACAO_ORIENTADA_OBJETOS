package Atividade;

import javax.swing.JOptionPane;

public class Pessoa_Main {

	public static void main(String[] args) {

		Pessoa humano1 = new Pessoa();
		
		humano1.setNome(JOptionPane.showInputDialog(null, "Digite o nome da 1� pessoa: "));
		humano1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: ")));
		humano1.setEndereco(JOptionPane.showInputDialog(null, "Digite o endere�o: "));
		
		Pessoa humano2 = new Pessoa();
		
		humano2.setNome(JOptionPane.showInputDialog(null, "Digite o nome da 2� pessoa: "));
		humano2.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: ")));
		humano2.setEndereco(JOptionPane.showInputDialog(null, "Digite o endere�o: "));
		
		JOptionPane.showMessageDialog(null, "Nome: " + humano1.getNome() + "\nIdade: " + 
				humano1.getIdade() + "\nEndere�o: " + humano1.getEndereco());
		
		JOptionPane.showMessageDialog(null, "Nome: " + humano2.getNome() + "\nIdade: " + 
				humano2.getIdade() + "\nEndere�o: " + humano2.getEndereco());
		
	}

}
