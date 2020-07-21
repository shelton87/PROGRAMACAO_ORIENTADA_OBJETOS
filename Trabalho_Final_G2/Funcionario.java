package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	
	// Variáveis
	private float salario;
	private String cargo;
	private Conta conta;
	
	//Construtor padrão
	public Funcionario() {	
	}
	
	//Construtor com parâmetro nome
	public Funcionario(String nome) {
		super.setNome(nome);
	}
	
	// Métodos Get e Set
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
	
	// Informação Funcionário
	public void informacao(Funcionario pessoa) {
		JOptionPane.showMessageDialog(null,"\nNome: " + pessoa.getNome() + "\nTelefone: " + pessoa.getTelefone() + "\nLogradouro: " + 
			pessoa.getEndereco().getLogradouro() + ", nº " + pessoa.getEndereco().getNumero() + "\nBairro: " + pessoa.getEndereco().getBairro() + 
			"\nCidade: " + pessoa.getEndereco().getCidade() + "\nCEP: " + pessoa.getEndereco().getCEP() + "\nCPF: " +
			pessoa.getDocPessoal().getCPF() + "\nRG: " + pessoa.getDocPessoal().getRG() + "\nData Nascimento: " + 
			pessoa.getDocPessoal().getDtNasc() + "\nCargo: " + pessoa.getCargo() + "\nSalário: " + pessoa.getSalario() + "\nBanco: " + 
			pessoa.getConta().getBanco() + "\nAgência: " + pessoa.getConta().getAgencia() + "\nConta: " + pessoa.getConta().getNumConta());	
	}
}
