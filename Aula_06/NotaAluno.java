package Atividade_Aula_06;

public class NotaAluno {
	
	// Atributos
	private String nomeAluno;
	private float nota1, nota2, media;
	
	// Construtor Padrão
	public NotaAluno() {
	}
	
	// Construtor 1
	public NotaAluno(String nomeAluno, float nota1, float nota2) {
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	// Métodos GET / SET
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	// Método MÉDIA ALUNO
	public float mediaDoAluno() {
		media = (nota1+nota2)/2;
		return media;
	}
	
	// Método APROVADO / REPROVADO
	public String statusAluno() {
		media = (nota1+nota2)/2;
		if(media > 7) {
			return "aprovado";
		} else {
			return "reprovado";
		}
	}	

}
