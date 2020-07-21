package Trabalho_Final_G2;

public class DocPessoal {
	
	private long CPF;
	private int RG;
	private String DtNasc;
	
	//Construtor padrão
	public DocPessoal() {		
	}
			
	//Construtor com parâmetro logradouro
	public DocPessoal(long CPF) {
		this.CPF = CPF;
	}
	
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public int getRG() {
		return RG;
	}
	public void setRG(int rG) {
		RG = rG;
	}
	public String getDtNasc() {
		return DtNasc;
	}
	public void setDtNasc(String dtNasc) {
		DtNasc = dtNasc;
	}

}
