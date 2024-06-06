package exercicios;

public class CarroTeste {
	public static void main(String [] args) {
		Carro carro1 = new Carro("hb20", "hyundai", 2015, "PYH-8805", "Prata");
		
		carro1.modelo = carro1.modelo.toUpperCase();
		carro1.marca = carro1.marca.toUpperCase();
		
		carro1.imprimirCarro();
	}
}
