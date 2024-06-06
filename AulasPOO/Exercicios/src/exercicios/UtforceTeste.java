package exercicios;

public class UtforceTeste {
	public static void main(String[] args) {
		Utforce carro1 = new Utforce();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		
		System.out.println(carro1.getMarcha());
		System.out.println(carro1.getVelocidade());
	}
}
