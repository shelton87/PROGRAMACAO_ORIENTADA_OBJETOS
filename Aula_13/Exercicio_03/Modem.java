package Exercicio_03;

public class Modem {
	
	private String nome, modelo;
	private int velUpload, velDownload, qtdPortasEthernet;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelUpload() {
		return velUpload;
	}
	public void setVelUpload(int velUpload) {
		this.velUpload = velUpload;
	}
	public int getVelDownload() {
		return velDownload;
	}
	public void setVelDownload(int velDownload) {
		this.velDownload = velDownload;
	}
	public int getQtdPortasEthernet() {
		return qtdPortasEthernet;
	}
	public void setQtdPortasEthernet(int qtdPortasEthernet) {
		this.qtdPortasEthernet = qtdPortasEthernet;
	}	

}
