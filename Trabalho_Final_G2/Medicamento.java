package Trabalho_Final_G2;

import javax.swing.JOptionPane;

public class Medicamento extends Produto {
	
	// Vari�veis
	private String tipoMedicamento;
	private String tipoTarja;
	
	// M�todos Get e Set
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

	// Informa��o Mediamento
	public void informacao(Medicamento produto) {
		JOptionPane.showMessageDialog(null,"\nNome: " + produto.getNome() +	"\nFabricante: " + produto.getFabricante() + 
			"\nData de validade: " + produto.getDataValidade() + "\nPre�o: " + produto.getPreco() +	"\nTipo: " + 
			produto.getTipoMedicamento() + "\nTarja: " + produto.getTipoTarja());	
	}
}