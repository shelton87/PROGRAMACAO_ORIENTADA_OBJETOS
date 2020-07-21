package Trabalho_Final_G2;

import java.util.ArrayList;

public class CestinhaCompra {
	
	// Vari�veis
	private String listProd="";
	private float valorTotal=0;
	
	// Cria��o Lista Produtos
	ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	
	// Adi��o de produto na lista
	public void adicionaProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
	// Listar os produtos que est�o na cesta
	public String listaProdutos() {
		if(listaProdutos.isEmpty()) {
			return "Nenhum produto consta na lista.";
		} else {
			for(int i=0; i<listaProdutos.size();i++) {
				Produto temp = listaProdutos.get(i);
				listProd = listProd + "\n" + temp.getNome();
			}
			return listProd;
		}		
	}	
	
	// Valor total da compra
	public float valorTotalCompra() {
		if(listaProdutos.isEmpty()) {
			return valorTotal = 0;
		} else {
			for(int i=0; i<listaProdutos.size();i++) {
				Produto temp = listaProdutos.get(i);
				valorTotal = valorTotal + temp.getPreco();
			}		
			return valorTotal;
		}		
	}
}