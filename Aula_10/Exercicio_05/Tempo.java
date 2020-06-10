package Exercicio_05;

public class Tempo {

	float temperatura;
	
	public void setTemperatura (float t) {
		temperatura = t;
	}
	
	public String statusTempo() {
		if (temperatura < 10) {
			return "muito frio";
		} else if ((temperatura >= 10) && (temperatura <=18)) {
			return "frio";
		} else if ((temperatura > 18) && (temperatura <=30)) {
			return "quente";
		} else {
			return "muito quente";
		}
	}	
	
}
