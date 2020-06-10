package Atividade_Aula_06;

import javax.swing.JOptionPane;

public class Produto_Main {		
	
	public static void main(String[] args) {
		
		// Declara��o das vari�veis
		String nome1, nome2, descricao2;
		float preco1, preco2;
		
		// Obtendo informa��es do usu�rio
		nome1 = JOptionPane.showInputDialog("Informe o nome do 1� produto: ");
		preco1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o pre�o do 1� produto: "));
		
		nome2 = JOptionPane.showInputDialog("Informe o nome do 2� produto: ");
		preco2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o pre�o do 2� produto: "));
		descricao2 = JOptionPane.showInputDialog("Informe a descri��o do 2� produto: ");
		
		// Instanciando objetos
		Produto p1 = new Produto(nome1, preco1);
		Produto p2 = new Produto(nome2, preco2, descricao2);		
		
		// Apresentando resultados
		JOptionPane.showMessageDialog(null, "LISTA PRODUTOS\n\nProduto: " + p1.getNome() + "\nPre�o: "
				+ p1.getPreco() + "\n\nProduto: " + p2.getNome() + "\nPre�o: " + p2.getPreco() + 
				"\nDescri��o: " + p2.getDescricao());
	}

}
