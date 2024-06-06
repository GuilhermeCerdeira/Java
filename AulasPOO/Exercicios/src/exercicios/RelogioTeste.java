package exercicios;

public class RelogioTeste {
	public static void main(String [] args) {
		Relogio r1 = new Relogio("Chevrolet", 10, 20);
		
		System.out.println(r1.getMarca());
		System.out.println(r1.getHora());
		System.out.println(r1.getMinuto());
	}
}
