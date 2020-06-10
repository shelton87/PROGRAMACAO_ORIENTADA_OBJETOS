package Exercicio_03;

public class ModemABC extends Modem {
	
	// Variáveis
	private int velPortaCoaxial;
	private boolean eTipo10base2, eTipo10base5;
	
	// Getters and Setters
	public int getVelPortaCoaxial() {
		return velPortaCoaxial;
	}
	public void setVelPortaCoaxial(int velPortaCoaxial) {
		this.velPortaCoaxial = velPortaCoaxial;
	}
	public boolean iseTipo10base2() {
		return eTipo10base2;
	}
	public void seteTipo10base2(boolean eTipo10base2) {
		this.eTipo10base2 = eTipo10base2;
		if (eTipo10base2) {
			eTipo10base5 = false;
		}
	}
	public boolean iseTipo10base5() {
		return eTipo10base5;
	}
	public void seteTipo10base5(boolean eTipo10base5) {
		this.eTipo10base5 = eTipo10base5;
		if (eTipo10base5) {
			eTipo10base2 = false;
		}
	}
		
	// Override Methods
	public int getQtdPortasEthernet() {		
		return 2;
	}
	
	// Verificação Tipo Cabo
	public String tipoCabo() {
		if (eTipo10base2) {
			return "Fino";
		} else {
			return "Grosso";
		}
	}

}
