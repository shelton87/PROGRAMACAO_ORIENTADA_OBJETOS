package Exercicio_03;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// Inserção dados modem1
		ModemABC modem1 = new ModemABC();
		
		modem1.setNome(JOptionPane.showInputDialog("Insira o nome do modem: "));
		modem1.setModelo(JOptionPane.showInputDialog("Insira o modelo do modem: "));
		modem1.setVelDownload(Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade "
				+ "de download: ")));
		modem1.setVelUpload(Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade "
				+ "de upload: ")));
		modem1.setVelPortaCoaxial(Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade "
				+ "da porta coaxial: ")));
		modem1.seteTipo10base2(Boolean.parseBoolean(JOptionPane.showInputDialog("A porta coaxial é "
				+ "10base2? 'True' ou 'False'")));
		if (modem1.iseTipo10base2() == false) {
			modem1.seteTipo10base5(Boolean.parseBoolean(JOptionPane.showInputDialog("A porta coaxial é "
					+ "10base5? 'True' ou 'False'")));
		}
		
		// Inserção dados modem2
		ModemXYZ modem2 = new ModemXYZ();
		
		modem2.setNome(JOptionPane.showInputDialog("Insira o nome do modem: "));
		modem2.setModelo(JOptionPane.showInputDialog("Insira o modelo do modem: "));
		modem2.setVelDownload(Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade "
				+ "de download: ")));
		modem2.setVelUpload(Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade "
				+ "de upload: ")));
		modem2.setVelPortaFibra(Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade "
				+ "da porta fibra: ")));
		
		// Apresentação modem1
		String infModem1 = "MODEM_01\nNome: " + modem1.getNome() + "\nModelo: " + modem1.getModelo() + 
				"\nVel. Download: " + modem1.getVelDownload() + "\nVel. Upload: " + modem1.getVelUpload()
				+ "\nQtd. Portas Ethernet: " + modem1.getQtdPortasEthernet() + "\nTipo de cabo: " + 
				modem1.tipoCabo() + "\nVel. Porta Coaxial: " + modem1.getVelPortaCoaxial();
		JOptionPane.showMessageDialog(null, infModem1);
		
		// Apresentação modem2
		String infModem2 = "MODEM_02\nNome: " + modem2.getNome() + "\nModelo: " + modem2.getModelo() + 
				"\nVel. Download: " + modem2.getVelDownload() + "\nVel. Upload: " + modem2.getVelUpload()
				+ "\nQtd. Portas Ethernet: " + modem2.getQtdPortasEthernet() + "\nVel. Porta Fibra: " +
				modem2.getVelPortaFibra() + "\nVel. Operação Modem: " + modem2.velocidadeBaixaOuAlta();
		JOptionPane.showMessageDialog(null, infModem2);		

	}

}
