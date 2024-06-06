package aula09;

public class ContaBancariaTeste {
	public static void main(String [] args) {
		ContaBancaria cb1 = new ContaBancaria(111, "Guilherme Cerdeira");
		cb1.ImprimirSaldo();
		
		cb1.Depositar(8000);
		
		cb1.ImprimirSaldo();
		
		System.out.println(cb1.getTitular() + " virou ");
		cb1.setTitular("Arthur Romão");
		
		System.out.println(cb1.getTitular());
	}
}
