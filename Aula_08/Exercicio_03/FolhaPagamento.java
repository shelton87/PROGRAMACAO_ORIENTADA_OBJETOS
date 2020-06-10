package Exercicio_03;

public class FolhaPagamento {
	
	private Funcionario funcionario1;
	private Funcionario funcionario2;
	
	public Funcionario getFuncionario1() {
		return funcionario1;
	}
	public void setFuncionario1(Funcionario funcionario1) {
		this.funcionario1 = funcionario1;
	}
	public Funcionario getFuncionario2() {
		return funcionario2;
	}
	public void setFuncionario2(Funcionario funcionario2) {
		this.funcionario2 = funcionario2;
	}
	
	public void calcularFolhaPagamento() {
		System.out.println("Total da folha de pagamento: R$ " + 
				(funcionario1.getSalario() + funcionario2.getSalario()));
	}
}
