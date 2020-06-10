package Exercicio_01;

import javax.swing.JOptionPane;

public class Main_Ventilador {

	public static void main(String[] args) {
		
		String mensagem, potencia = null;
		
		Ventilador ventilador = new Ventilador();
		
		ventilador.setNome(JOptionPane.showInputDialog("Digite o nome do ventilador"));
		ventilador.setMarca(JOptionPane.showInputDialog("Digite a marca do ventilador"));
		
		while(true) {
			try {			
				
				potencia = JOptionPane.showInputDialog("Digite a pot�ncia do ventilador");
				ventilador.setPotencia(Integer.parseInt(potencia));
				break;
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}			
		}		
		
		mensagem = "O ventilador " + ventilador.getNome() + " � da marca " + ventilador.getMarca()
		+ " e possui " + ventilador.getPotencia() + "W de pot�ncia.";
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
