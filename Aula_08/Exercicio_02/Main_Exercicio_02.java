package Exercicio_02;

public class Main_Exercicio_02 {

	public static void main(String[] args) {
		
		Computador computador = new Computador();
		Processador processador = new Processador();
		
		computador.setNome("CCE");
		computador.setPreco(650);
		
		processador.setClock(1300);
		processador.setMarca("INTEL");
		computador.setCpu(processador);
		
		System.out.println("DADOS DO COMPUTADOR");
		System.out.println("Nome: " + computador.getNome());
		System.out.println("Preço: R$" + computador.getPreco());
		System.out.println("Processador: " + computador.getCpu().getMarca());
		System.out.println("Clock: " + computador.getCpu().getClock());
		computador.getCpu().statusProcessador();
	}
}
