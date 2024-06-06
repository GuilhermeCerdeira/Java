package exercicios;

public class Pessoa {
	String nome;
	boolean sexo;
	int cpf;
	int idade;
	double altura;
	double peso;
	
	public Pessoa(String nome, boolean sexo, int cpf, int idade, double altura, double peso) {
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	public void imprimir() {
		System.out.println(this.nome);
		if(this.sexo == false)
		System.out.println("Masculino");
		else
		System.out.println("Feminino");
		System.out.println(this.cpf);
		System.out.println(this.idade);
		System.out.println(this.altura);
		System.out.println(this.peso);
	}
	
	public void andar() {
		
	}
	public void correr() {
		
	}
	public void falar() {
		
	}
	public void dormir() {
		
	}
}
