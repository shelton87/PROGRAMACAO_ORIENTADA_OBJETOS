package Atividade_Aula_06;

import javax.swing.JOptionPane;

public class Produto_Main {		
	
	public static void main(String[] args) {
		
		// Declaração das variáveis
		String nome1, nome2, descricao2;
		float preco1, preco2;
		
		// Obtendo informações do usuário
		nome1 = JOptionPane.showInputDialog("Informe o nome do 1º produto: ");
		preco1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do 1º produto: "));
		
		nome2 = JOptionPane.showInputDialog("Informe o nome do 2º produto: ");
		preco2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do 2º produto: "));
		descricao2 = JOptionPane.showInputDialog("Informe a descrição do 2º produto: ");
		
		// Instanciando objetos
		Produto p1 = new Produto(nome1, preco1);
		Produto p2 = new Produto(nome2, preco2, descricao2);		
		
		// Apresentando resultados
		JOptionPane.showMessageDialog(null, "LISTA PRODUTOS\n\nProduto: " + p1.getNome() + "\nPreço: "
				+ p1.getPreco() + "\n\nProduto: " + p2.getNome() + "\nPreço: " + p2.getPreco() + 
				"\nDescrição: " + p2.getDescricao());
	}

}
