package aula12.exercicio1;

public class Professor extends Pessoa {
	private double salarioBase;
	private double salarioTitulacao;
	
	public Professor(String nome, int idade, int salarioBase, int salarioTitulacao) {
		super(nome, idade);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}
	
	public double calcularSalario() {
		return this.salarioBase + this.salarioTitulacao;
	}
	
	public void imprimirDados() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.salarioBase);
		System.out.println(this.salarioTitulacao);
	}


}
