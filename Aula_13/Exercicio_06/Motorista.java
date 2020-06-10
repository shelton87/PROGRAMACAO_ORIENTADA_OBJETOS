package Exercicio_06;

public class Motorista extends Funcionario {

	@Override
	public float getSalario() {
		
		return (super.getSalario() * 1.3f);		
	}

	@Override
	public String getNome() {
		
		return (super.getNome() + " (MOT.)");
	}
	
}
