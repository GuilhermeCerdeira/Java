package exercicios;

public class Carro {
	
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	
	public Carro(String modelo, String marca, int ano, String placa, String cor){
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
	}
	
	public void imprimirCarro() {
		System.out.println(this.modelo + " " + this.marca + " " + this.ano + " " +  this.placa + " " + this.cor);
	}
	
	public void ligar() {
		
	}
	public void desligar() {
		
	}
	public void acelerar() {
		
	}
	public void desacelerar() {
		
	}
}
