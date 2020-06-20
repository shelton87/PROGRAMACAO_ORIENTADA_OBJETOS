package Padaria;

public class Main_APS_Aula15 {

	public static void main(String[] args) {		
		
		Leite leite = new Leite();
		
		leite.setNome("Latvida");
		leite.setPreco(2.75f);
		leite.setMarca("Alimentos Estrela");
		leite.setTipoLeite("Integral");
				
		Pao pao = new Pao();
		
		pao.setNome("Bisnaguinha");
		pao.setPreco(3.49f);
		pao.setMarca("Farias");
		pao.setMarcaFarinha("Dona Benta");
		
		OutrosProdutos queijo = new OutrosProdutos();
		
		queijo.setNome("Queijo Mussarela Fatiado 150G");
		queijo.setPreco(4.50f);
		queijo.setMarca("Santa Clara");
		
		OutrosProdutos salame = new OutrosProdutos();
		
		salame.setNome("Salame Italiano Fatiado Seara 100G");
		salame.setPreco(8.99f);
		salame.setMarca("Seara");
		
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		carrinho.setProduto1(leite);
		carrinho.setProduto2(pao);
		carrinho.setProduto3(queijo);
		carrinho.setProduto4(salame);
		carrinho.listaProdutos();
		carrinho.valorTotalCompras();
		
		pao.descricao();
		leite.descricao();
		queijo.descricao();
		salame.descricao();
	}
}
