package aula12.exercicio1;

public class Aluno extends Pessoa {
	private String curso;

	public Aluno(String nome, int idade, String curso) {
		super(nome, idade);
		this.curso = curso;
	}
	
	public void realizarMatricula(String curso) {
		this.curso = curso;
	}
	
	public void imprimirDados() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.curso);
	
	}
}