package Exercicio_02;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
				
		Motorista motorista = new Motorista();
		
		motorista.setNome(JOptionPane.showInputDialog("Insira o nome do funcionário: "));
		motorista.setFuncao(JOptionPane.showInputDialog("Insira a função do funcionário: "));
		motorista.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Insira o salário "
				+ "do funcionário: ")));
		
		Cobrador cobrador = new Cobrador();
		
		cobrador.setNome(JOptionPane.showInputDialog("Insira o nome do funcionário: "));
		cobrador.setFuncao(JOptionPane.showInputDialog("Insira a função do funcionário: "));
		cobrador.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Insira o salário "
				+ "do funcionário: ")));

		JOptionPane.showMessageDialog(null, "Funcionário: " + motorista.getNome() + "\nFunção: " 
				+ motorista.getFuncao() + "\nSalário: " + motorista.getSalario()  + "\n\nFuncionário: " + 
				cobrador.getNome() + "\nFunção: " + cobrador.getFuncao() + "\nSalário: " + 
				cobrador.getSalario());
	}

}
