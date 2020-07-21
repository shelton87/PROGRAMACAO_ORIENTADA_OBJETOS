package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class Medicamento extends Produto {
	
	// Variáveis
	private String tipoMedicamento;
	private String tipoTarja;
	
	// Métodos Get e Set
	public String getTipoMedicamento() {
		return tipoMedicamento;
	}
	public void setTipoMedicamento(String tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}
	public String getTipoTarja() {
		return tipoTarja;
	}
	public void setTipoTarja(String tipoTarja) {
		this.tipoTarja = tipoTarja;
	}

	// Informação Mediamento
	public void informacao(Medicamento produto) {
		JOptionPane.showMessageDialog(null,"\nNome: " + produto.getNome() +	"\nFabricante: " + produto.getFabricante() + 
			"\nData de validade: " + produto.getDataValidade() + "\nPreço: " + produto.getPreco() +	"\nTipo: " + 
			produto.getTipoMedicamento() + "\nTarja: " + produto.getTipoTarja());	
	}
}