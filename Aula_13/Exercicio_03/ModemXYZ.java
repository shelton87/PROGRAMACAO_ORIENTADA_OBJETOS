package Exercicio_03;

public class ModemXYZ extends Modem {
	
	// Vari�veis
	private int velPortaFibra;
	
	// Getters and Setters
	public int getVelPortaFibra() {
		return velPortaFibra;
	}
	
	public void setVelPortaFibra(int velPortaFibra) {
		this.velPortaFibra = velPortaFibra;
	}
	
	// Override Methods
	public int getQtdPortasEthernet() {		
		return 4;
	}
	
	// Verifica��o Velocidade
	public String velocidadeBaixaOuAlta() {
		if (velPortaFibra > 1000) {
			return "Alta";
		} else {
			return "Baixa";
		}
		
	}

}
