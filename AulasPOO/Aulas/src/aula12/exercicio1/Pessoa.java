package aula12.exercicio1;

public class Pessoa {
	protected String nome;
	protected int idade;
	
	public Pessoa(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprimirDado() {
		System.out.println(this.nome);
		System.out.println(this.idade);
	}

}
