package aula07;

public class Carro {
	
	//atributos da classe
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	int velocidade = 0;
	
	//método construtor
	public Carro(String modelo, String marca, int ano, String placa, String cor) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.ligado = false;
	}
	
	public Carro(String placa){
		this("Não informado", "Não informado", 0, placa, "Não informado");
	}
	
	public Carro(int ano) {
		this("Não informado", "Não informado", ano, "Não informado", "Não informado");
	}
	
	public void obterNumeroCaracteres() {
		System.out.println(this.modelo.length());
	}
	
	//metodos da classe
	public void ligar() {
		System.out.println(marca + " " + modelo + " esta ligando.");
		if(!ligado) {
			ligado = true;
		}
	}

	public void desligar() {
		System.out.println(marca + " " + modelo + " esta desligando.");
		if(ligado) {
			ligado = false;
		}
	}
	
	public void acelerar() {
		System.out.println(marca + " " + modelo + " esta acelerando.");
		if(ligado) {
			velocidade = velocidade + 10;
		}
	}
	
	public void frear() {
		System.out.println(marca + " " + modelo + " esta freando.");
		if(ligado) {
			velocidade = velocidade + 10;
		}
	}
	
	public void imprimir() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Ano: " + this.ano);
		System.out.println("Placa: " + this.placa);
		System.out.println("Cor: " + this.cor);
		System.out.println("Velocidade: " + velocidade);
		System.out.println("Ligado: " + ligado);
		System.out.println("=====================");
	}
	
	public String toString() {
		return modelo + " " + marca + " " + ano + " " + placa + " " + cor;
 	}
}
