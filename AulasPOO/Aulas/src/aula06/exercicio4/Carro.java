package aula06.exercicio4;

public class Carro{
	// atributos da classe
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	int velocidade = 0;
	
	// métodos da classe
	public void ligar() {
		System.out.println(marca + " " + modelo + " está ligando.");
		if(ligado == false) {
			ligado = true;
		}
		else {
			System.out.println("O carro ja está ligado");
		}
	}
	
	public void desligar() {
		System.out.println(marca + " " + modelo + " está desligando");
		if(velocidade != 0) {
			System.out.println("O carro está andando!");
			return;
		}
		else if(ligado == false) {
			System.out.println("O carro ja está desligado");
			return;
		}
		ligado = false;
	}
	
	public void acelerar() {
		System.out.println(marca + " " + modelo + " está acelerando");
		if(ligado == false) {
			System.out.println("O carro está desligado!");
		}
	}
	
	public void frear() {
		System.out.println(marca + " " + modelo + " está freiando");
	}
	
	public void imprimirDados() {
		System.out.println("==============// CARRO //==============");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Ano: " + ano);
		System.out.println("Placa: " + placa);
		System.out.println("Cor: " + cor);
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}