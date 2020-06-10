package Exercicio_02;

public class Cobrador extends Funcionario{
	
	@Override
	public float getSalario() {
		
		return (super.getSalario() * 1.15f);		
	}

	@Override
	public String getNome() {
		
		return (super.getNome() + " (COB.)");
	}

}
