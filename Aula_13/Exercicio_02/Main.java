package Exercicio_02;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
				
		Motorista motorista = new Motorista();
		
		motorista.setNome(JOptionPane.showInputDialog("Insira o nome do funcion�rio: "));
		motorista.setFuncao(JOptionPane.showInputDialog("Insira a fun��o do funcion�rio: "));
		motorista.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Insira o sal�rio "
				+ "do funcion�rio: ")));
		
		Cobrador cobrador = new Cobrador();
		
		cobrador.setNome(JOptionPane.showInputDialog("Insira o nome do funcion�rio: "));
		cobrador.setFuncao(JOptionPane.showInputDialog("Insira a fun��o do funcion�rio: "));
		cobrador.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Insira o sal�rio "
				+ "do funcion�rio: ")));

		JOptionPane.showMessageDialog(null, "Funcion�rio: " + motorista.getNome() + "\nFun��o: " 
				+ motorista.getFuncao() + "\nSal�rio: " + motorista.getSalario()  + "\n\nFuncion�rio: " + 
				cobrador.getNome() + "\nFun��o: " + cobrador.getFuncao() + "\nSal�rio: " + 
				cobrador.getSalario());
	}

}
