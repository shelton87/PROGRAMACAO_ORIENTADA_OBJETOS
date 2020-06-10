package Exercicio_06;

import javax.swing.JOptionPane;

public class Funcionario {
	
	// Vari�veis
	private String nome;
	private String funcao;
	private float salario;
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	// Polimorfismo
	public void mostraDetalhesFuncionario(Funcionario funcionario) {
		String info = "\nCategoria do funcion�rio: " + funcionario.getClass().getSimpleName() + 
			"\nNome: "+ funcionario.getNome() + "\nSal�rio: R$" + funcionario.getSalario();
		JOptionPane.showMessageDialog(null, info);
	}

}
