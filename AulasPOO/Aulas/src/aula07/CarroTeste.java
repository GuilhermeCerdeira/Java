package aula07;

public class CarroTeste {
	
	public static void main(String[] args) {
		//instanciar objetos
		Carro carro1 = new Carro("hb20", "hyundai", 2015, "PYH-8805", "Prata");
		Carro carro2 = new Carro("MO-2973");
		Carro carro3 = new Carro(2015);
		
		
		carro1.obterNumeroCaracteres();
		carro1.modelo = carro1.modelo.toUpperCase();
		
		
		//obter valores dos atributos do objeto
		System.out.println("=====================");
		carro1.imprimir();
		carro2.imprimir();
		carro3.imprimir();
	}
}