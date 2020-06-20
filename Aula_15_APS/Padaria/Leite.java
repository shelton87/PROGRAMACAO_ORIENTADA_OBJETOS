package Padaria;

public class Leite extends Produto {
	
	private String tipoLeite;
	
	public String getTipoLeite() {
		return tipoLeite;
	}
	
	public void setTipoLeite(String tipoLeite) {
		this.tipoLeite = tipoLeite;
	}

	@Override
	public void descricao() {
		System.out.println("\nNome: " + super.getNome() + "\nPreço: " + super.getPreco() + 
				"\nTipo de leite: " + tipoLeite);
	}	
}
