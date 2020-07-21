package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class Fornecedor {
	
	private String RazaoSocial;
	private String CNPJ;
	private Endereco endereco;
	private String telefone;
	private String fornecedorDe;
	
	//Construtor padrão
	public Fornecedor() {	
	}
		
	//Construtor com parâmetro nome
	public Fornecedor(String RazaoSocial) {
		this.RazaoSocial = RazaoSocial;
	}
	
	public String getRazaoSocial() {
		return RazaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getFornecedorDe() {
		return fornecedorDe;
	}
	public void setFornecedorDe(String fornecedorDe) {
		this.fornecedorDe = fornecedorDe;
	}
	
	// Informação Funcionário
	public void informacao(Fornecedor pessoa) {
		JOptionPane.showMessageDialog(null,"\nRazão Social: " + pessoa.getRazaoSocial() + "\nTelefone: " + pessoa.getTelefone() + 
			"\nCNPJ: " + pessoa.getCNPJ() + "\nO que fornece: " + pessoa.getFornecedorDe() + "\nLogradouro: " + 
			pessoa.getEndereco().getLogradouro() + ", nº " + pessoa.getEndereco().getNumero() + "\nBairro: " + pessoa.getEndereco().getBairro() + 
			"\nCidade: " + pessoa.getEndereco().getCidade() + "\nCEP: " + pessoa.getEndereco().getCEP());	
	}
}
