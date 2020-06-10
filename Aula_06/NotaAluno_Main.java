package Atividade_Aula_06;

import javax.swing.JOptionPane;

public class NotaAluno_Main {

	public static void main(String[] args) {
		
		// Declaração de variáveis
		String a1nome, a2nome;
		float a1nota1, a1nota2, a2nota1, a2nota2;
		
		// Obtendo informações do usuário
		a1nome = JOptionPane.showInputDialog("Digite o nome do 1º aluno: ");
		a1nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1 do 1º aluno: "));
		a1nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2 do 1º aluno: "));
		
		// Instanciando objeto
		NotaAluno aluno1 = new NotaAluno();
		aluno1.setNomeAluno(a1nome);
		aluno1.setNota1(a1nota1);
		aluno1.setNota2(a1nota2);
		
		// Obtendo informações do usuário
		a2nome = JOptionPane.showInputDialog("Digite o nome do 2º aluno: ");
		a2nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1 do 2º aluno: "));
		a2nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2 do 2º aluno: "));
		
		// Instanciando objeto
		NotaAluno aluno2 = new NotaAluno(a2nome, a2nota1, a2nota2);
		
		// Apresentando resultados
		JOptionPane.showMessageDialog(null, "LISTA DOS ALUNOS\n\nAluno: " + aluno1.getNomeAluno() + 
				"\nStatus: " + aluno1.statusAluno() + "\n\nAluno: " + aluno2.getNomeAluno() + 
				"\nStatus: " + aluno2.statusAluno());
		
	}

}
