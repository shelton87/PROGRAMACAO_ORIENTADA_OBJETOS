package Atividade;

import javax.swing.JOptionPane;

public class FolhaDePagamento_Main {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis
		float salario1, salario2;
		
		// Cria��o do objeto "fp"
		FolhaDePagamento fp = new FolhaDePagamento();
		
		// Inser��o 1� Nome
		fp.setNome1(JOptionPane.showInputDialog(null, "Digite o 1� nome: "));
		
		// Inser��o e verifica��o 1� Sal�rio
		do {
			salario1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do sal�rio: "));
			if (salario1 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO.");
			} else {
				fp.setSalario1(salario1);
			}
		} while (salario1 < 0);
		
		// Inser��o 2� Nome
		fp.setNome2(JOptionPane.showInputDialog(null, "Digite o 2� nome: "));
		
		// Inser��o e verifica��o 2� Sal�rio
		do {
			salario2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do sal�rio: "));
			if (salario2 < 0) {
				JOptionPane.showMessageDialog(null, "ERRO: VALOR NEGATIVO.");
			} else {
				fp.setSalario2(salario2);
			}
		} while (salario2 < 0);
		
		// Apresenta��o resultado
		JOptionPane.showMessageDialog(null, "FOLHA DE PAGAMENTO\nNome: " + fp.getNome1() + 
				"\nSal�rio: R$" + fp.getSalario1() + "\nNome: " + fp.getNome2() + "\nSal�rio: R$" +
				fp.getSalario2() + "\n\nTotal Folha de Pagamento: R$" + fp.totalFolhaPagamento());

	}

}
