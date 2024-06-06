package exercicios1.exercicio1;

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
		carro1.chassi = "preto";
		carro1.renavam = 123456789;
		
		// obter valores dos atributos do objeto
		System.out.println("==============// CARRO 1 //==============");
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Ano: " + carro1.ano);
		System.out.println("Placa: " + carro1.placa);
		System.out.println("Cor: " + carro1.cor);
		System.out.println("Chassi: " + carro1.chassi);
		System.out.println("Renavam: " + carro1.renavam);
		
		//atribuindo valores aos atributos de carro2
		carro2.modelo = "hb20";
		carro2.marca = "Hyundai";
		carro2.ano = 2016;
		carro2.placa = "PYH-8805";
		carro2.cor = "Prata";
		carro2.chassi = "roxo";
		carro2.renavam = 987654321;
		
		System.out.println("==============// CARRO 2 //==============");
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Marca: " + carro2.marca);
		System.out.println("Ano: " + carro2.ano);
		System.out.println("Placa: " + carro2.placa);
		System.out.println("Cor: " + carro2.cor);
		System.out.println("Chassi: " + carro2.chassi);
		System.out.println("Renavam: " + carro2.renavam);

	}
}
