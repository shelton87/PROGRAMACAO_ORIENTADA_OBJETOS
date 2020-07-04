package Atv_Aula17_Exe01;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		boolean ret;

		// Criação do mapa dos alunos
		HashMap<String,Aluno> mapa = new HashMap<String,Aluno>();
		
		// Criando aluno 01
		Aluno aluno1 = new Aluno();
		aluno1.setNome(JOptionPane.showInputDialog("Nome do aluno 01: "));
		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno 01:")));
		aluno1.setCpf(JOptionPane.showInputDialog("CPF do aluno 01"));
		mapa.put(aluno1.getCpf(),aluno1);
		
		// Criando aluno 02
		Aluno aluno2 = new Aluno();
		aluno2.setNome(JOptionPane.showInputDialog("Nome do aluno 02: "));
		aluno2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno 02:")));
		aluno2.setCpf(JOptionPane.showInputDialog("CPF do aluno 02"));
		mapa.put(aluno2.getCpf(),aluno2);
		
		// Criando aluno 03
		Aluno aluno3 = new Aluno();
		aluno3.setNome(JOptionPane.showInputDialog("Nome do aluno 03: "));
		aluno3.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno 03:")));
		aluno3.setCpf(JOptionPane.showInputDialog("CPF do aluno 03"));
		mapa.put(aluno3.getCpf(),aluno3);
		
		// Escolhendo aluno para visualizar informações
		do {
			String escolha = JOptionPane.showInputDialog("Digite um dos CPF listados a baixo para "
					+ "buscar mais informações"	+ "\n" + aluno1.getCpf() + "\n" + aluno2.getCpf() 
					+ "\n" + aluno3.getCpf());		
			
			ret = mapa.containsKey(escolha);
			if(ret == true) {
				Aluno escolhido = mapa.get(escolha);
				JOptionPane.showMessageDialog(null,"Aluno: " + escolhido.getNome() + "\nIdade: " + 
						escolhido.getIdade() + "\nCPF: " + escolhido.getCpf());
			}else {
				JOptionPane.showMessageDialog(null,"CPF informado não consta.");
			}	
		} while(ret == false);					

	}//main

}//Main
