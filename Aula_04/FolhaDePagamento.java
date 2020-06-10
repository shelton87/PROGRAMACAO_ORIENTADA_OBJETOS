package Atividade;

public class FolhaDePagamento {
	
	// Atributos
	
	private String nome1, nome2;
	private float salario1, salario2;
	
	// Métodos NOME1
	
	public String getNome1() {
		return nome1;
	}
	
	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}
	
	// Métodos NOME2
	
	public String getNome2() {
		return nome2;
	}
	
	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
	
	// Métodos SALARIO1
	
	public float getSalario1() {
		return salario1;
	}
	
	public void setSalario1(float salario1) {
		if (salario1 > 0) {
			this.salario1 = salario1;
		}
	}
	
	// Métodos SALARIO2
	
	public float getSalario2() {
		return salario2;
	}
		
	public void setSalario2(float salario2) {
		if (salario2 > 0) {
			this.salario2 = salario2;
		}
	}
	
	// Método TOTAL FOLHA PAGAMENTO
	
	public float totalFolhaPagamento() {
		return salario1 + salario2;
	}
	
}
