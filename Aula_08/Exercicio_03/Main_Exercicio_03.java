package Exercicio_03;

public class Main_Exercicio_03 {

	public static void main(String[] args) {
		
		FolhaPagamento fp = new FolhaPagamento();
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.setNome("João Carlos Pereira");
		func1.setSalario(3000);
		fp.setFuncionario1(func1);

		func2.setNome("Maria Célia Aguiar");
		func2.setSalario(4500);
		fp.setFuncionario2(func2);
		
		fp.calcularFolhaPagamento();
	}
}
