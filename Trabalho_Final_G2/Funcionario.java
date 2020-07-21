package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	
	// Vari�veis
	private float salario;
	private String cargo;
	private Conta conta;
	
	//Construtor padr�o
	public Funcionario() {	
	}
	
	//Construtor com par�metro nome
	public Funcionario(String nome) {
		super.setNome(nome);
	}
	
	// M�todos Get e Set
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	// Informa��o Funcion�rio
	public void informacao(Funcionario pessoa) {
		JOptionPane.showMessageDialog(null,"\nNome: " + pessoa.getNome() + "\nTelefone: " + pessoa.getTelefone() + "\nLogradouro: " + 
			pessoa.getEndereco().getLogradouro() + ", n� " + pessoa.getEndereco().getNumero() + "\nBairro: " + pessoa.getEndereco().getBairro() + 
			"\nCidade: " + pessoa.getEndereco().getCidade() + "\nCEP: " + pessoa.getEndereco().getCEP() + "\nCPF: " +
			pessoa.getDocPessoal().getCPF() + "\nRG: " + pessoa.getDocPessoal().getRG() + "\nData Nascimento: " + 
			pessoa.getDocPessoal().getDtNasc() + "\nCargo: " + pessoa.getCargo() + "\nSal�rio: " + pessoa.getSalario() + "\nBanco: " + 
			pessoa.getConta().getBanco() + "\nAg�ncia: " + pessoa.getConta().getAgencia() + "\nConta: " + pessoa.getConta().getNumConta());	
	}
}
