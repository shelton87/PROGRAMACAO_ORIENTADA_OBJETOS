package Atividade;

import javax.swing.JOptionPane;

public class FolhaDePagamento_Main {

	public static void main(String[] args) {
		
		// Declaração das variáveis
		float salario1, salario2;
		
		// Criação do objeto "fp"
		FolhaDePagamento fp = new FolhaDePagamento();
		
		// Inserção 1º Nome
		fp.setNome1(JOptionPane.showInputDialog(null, "Digite o 1º nome: "));
		
		// Inserção e verificação 1º Salário
		do {
			salario1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do salário: "));
			if (salario1 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO.");
			} else {
				fp.setSalario1(salario1);
			}
		} while (salario1 < 0);
		
		// Inserção 2º Nome
		fp.setNome2(JOptionPane.showInputDialog(null, "Digite o 2º nome: "));
		
		// Inserção e verificação 2º Salário
		do {
			salario2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do salário: "));
			if (salario2 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO.");
			} else {
				fp.setSalario2(salario2);
			}
		} while (salario2 < 0);
		
		// Apresentação resultado
		JOptionPane.showMessageDialog(null, "FOLHA DE PAGAMENTO\nNome: " + fp.getNome1() + 
				"\nSalário: R$" + fp.getSalario1() + "\nNome: " + fp.getNome2() + "\nSalário: R$" +
				fp.getSalario2() + "\n\nTotal Folha de Pagamento: R$" + fp.totalFolhaPagamento());

	}

}
