package Trabalho_Final_G2;

public class Pessoa {
	
	// Variáveis
	private String nome;
	private Endereco endereco;
	private String telefone;
	private DocPessoal docPessoal;
	
	// Métodos Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public DocPessoal getDocPessoal() {
		return docPessoal;
	}
	public void setDocPessoal(DocPessoal docPessoal) {
		this.docPessoal = docPessoal;
	}
}