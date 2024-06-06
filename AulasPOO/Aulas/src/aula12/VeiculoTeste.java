package aula12;

public class VeiculoTeste {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Gol", "Volkswagen", 2015, 10, "Etanol");
		
		carro1.abastecer();
		
		Aviao aviao1 = new Aviao("fabricante", "modelo", 2010, 40, "gasolina");
		
		aviao1.voar();
		aviao1.abastecer();
	}
}
