package Atv_Aula17_Exe2;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		boolean ret;
		String escolha, listIP="";
		int menu, contador=0;
		
		// Criação do mapa dos alunos
		HashMap<String,Computador> mapaComp = new HashMap<String,Computador>();
		
		// Criação dos computadores
		for(int x=1; x<=3; x++) {
			Computador comp = new Computador();
			comp.setIp(JOptionPane.showInputDialog("Computador " + x + "\nDigite o IP: "));
			comp.setSistemaOperacional(JOptionPane.showInputDialog("Computador " + x + 
					"\nDigite Sistema Operacional: "));
			ret = mapaComp.containsKey(comp.getIp());
			if(ret == true) {
				JOptionPane.showMessageDialog(null, "Já existe computador com esse IP.");
			} else {
				mapaComp.put(comp.getIp(),comp);
			}			
		}				
		
		// Menu para agapar ou sair do programa
		while(true) {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da opção:\n1 - "
					+ "Remover Computador\n2 - Sair"));
			// Opção 1 - Remover
			listIP = "";
			contador = 0;
			if(menu == 1) {
				for (String key : mapaComp.keySet()) {
					Computador auxComp = mapaComp.get(key);
					listIP = listIP + auxComp.getIp() + " - " + auxComp.getSistemaOperacional() + "\n";
					contador++;
				}	
				if(contador != 0) {
					escolha = JOptionPane.showInputDialog("Digite um dos IPs para remover do cadastro:\n" + listIP);		
					ret = mapaComp.containsKey(escolha);
					if(ret == false) {
						JOptionPane.showMessageDialog(null, "IP informado incorreto.");
					} else {
						mapaComp.remove(escolha);
						JOptionPane.showMessageDialog(null, "Computador removido com sucesso.");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Não existe computador cadastrado.");					
				}

			}// Final Opção 1 - Remover
			
			// Opção 2 - Sair
			if(menu == 2) {break;}
			
			//Opção Inválida
			if((menu!=1)&&(menu!=2)) {
				JOptionPane.showMessageDialog(null, "Opção Inválida.");
			}
			
		}// Final while	
	}
}