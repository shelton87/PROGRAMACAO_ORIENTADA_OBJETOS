package Padaria;

public class CarrinhoCompras {
	
	private Produto produto1, produto2, produto3, produto4, produto5;
	private float valorTotal=0;

	public Produto getProduto1() {
		return produto1;
	}

	public void setProduto1(Produto produto1) {
		this.produto1 = produto1;
	}

	public Produto getProduto2() {
		return produto2;
	}

	public void setProduto2(Produto produto2) {
		this.produto2 = produto2;
	}

	public Produto getProduto3() {
		return produto3;
	}

	public void setProduto3(Produto produto3) {
		this.produto3 = produto3;
	}

	public Produto getProduto4() {
		return produto4;
	}

	public void setProduto4(Produto produto4) {
		this.produto4 = produto4;
	}

	public Produto getProduto5() {
		return produto5;
	}

	public void setProduto5(Produto produto5) {
		this.produto5 = produto5;
	}
	
	// Valor total da compra
	public void valorTotalCompras() {
		if ((produto1 != null) || (produto2 != null) || (produto3 != null) || (produto4 != null)
				|| (produto5 != null)) {			
			if (produto1 != null) {
				valorTotal = valorTotal + produto1.getPreco();
			}
			if (produto2 != null) {
				valorTotal = valorTotal + produto2.getPreco();
			}
			if (produto3 != null) {
				valorTotal = valorTotal + produto3.getPreco();
			}
			if (produto4 != null) {
				valorTotal = valorTotal + produto4.getPreco();
			}
			if (produto5 != null) {
				valorTotal = valorTotal + produto5.getPreco();
			}
			System.out.println("\nValor total da compra: R$" + valorTotal);
		} else {
			System.out.println("\nCarrinho não possui itens.");
		}		
	}
	
	// Mostrar todos os produtos do carrinho
	public void listaProdutos() {
		if ((produto1 != null) || (produto2 != null) || (produto3 != null) || (produto4 != null)
				|| (produto5 != null)) {
			System.out.println("Produtos no carrinho:");
			if (produto1 != null) {
				System.out.println(produto1.getNome());
			}
			if (produto2 != null) {
				System.out.println(produto2.getNome());
			}
			if (produto3 != null) {
				System.out.println(produto3.getNome());
			}
			if (produto4 != null) {
				System.out.println(produto4.getNome());
			}
			if (produto5 != null) {
				System.out.println( produto5.getNome());
			}			
		} else {
			System.out.println("Não existe produto na lista.");
		}
	}
}
