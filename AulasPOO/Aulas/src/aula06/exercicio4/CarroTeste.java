package aula06.exercicio4;


public class CarroTeste {

	public static void main(String[] args) {
		
		// instanciar objetos
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		//atribuir valores aos atributos de cada objeto
		carro1.modelo = "uno";
		carro1.marca = "fiat";
		carro1.ano = 1996;
		carro1.placa = "OII-011";
		carro1.cor = "branco";
		
		//atribuindo valores aos atributos de carro2
		carro2.modelo = "hb20";
		carro2.marca = "Hyundai";
		carro2.ano = 2016;
		carro2.placa = "PYH-8805";
		carro2.cor = "Prata";
		
		//obter valores dos atributos do objeto
		System.out.println(carro1);
		System.out.println(carro2);
		
		carro1.ligar();
		carro1.acelerar();
		
		
		carro2.ligar();
	}
}
