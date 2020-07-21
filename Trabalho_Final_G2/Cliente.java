package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa{
	
	//Construtor padr�o
	public Cliente() {	
	}
		
	//Construtor com par�metro nome
	public Cliente(String nome) {
		super.setNome(nome);
	}
	
	// Sobrecarga de m�todos
	public void setDocPessoal(long CPF, int RG) {
		getDocPessoal().setCPF(CPF);
		getDocPessoal().setRG(RG);
	}
	
	public void setDocPessoal(long CPF, String DtNasc) {
		getDocPessoal().setCPF(CPF);
		getDocPessoal().setDtNasc(DtNasc);
	}

	// Informa��o Cliente
	public void informacao(Cliente pessoa) {
		JOptionPane.showMessageDialog(null,"\nNome: " + pessoa.getNome() + "\nTelefone: " + pessoa.getTelefone() + "\nLogradouro: " + 
			pessoa.getEndereco().getLogradouro() + ", n� " + pessoa.getEndereco().getNumero() + "\nBairro: " + pessoa.getEndereco().getBairro() + 
			"\nCidade: " + pessoa.getEndereco().getCidade() + "\nCEP: " + pessoa.getEndereco().getCEP() + "\nCPF: " +
			pessoa.getDocPessoal().getCPF() + "\nRG: " + pessoa.getDocPessoal().getRG() + "\nData Nascimento: " + 
			pessoa.getDocPessoal().getDtNasc());	
	}
}