package Padaria;

public class Pao extends Produto {
	
	private String marcaFarinha;

	public String getMarcaFarinha() {
		return marcaFarinha;
	}

	public void setMarcaFarinha(String marcaFarinha) {
		this.marcaFarinha = marcaFarinha;
	}

	@Override
	public void descricao() {		
		System.out.println("\nNome: " + super.getNome() + "\nPreço: " + super.getPreco() + 
				"\nMarca da farinha: " + marcaFarinha);		
	}
}
