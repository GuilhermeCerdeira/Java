package lista05;

public class BibliotecaTeste {
	public static void main(String[] args) {
		Biblioteca l1 = new Biblioteca();
		
		
		l1.criarLivro("Baratinha", "Kafka", 2002, 300);
		
		l1.realizarEmprestimo("Baratinha", 10);
		
		l1.criarLivro("Ensaio sobre a cegueira", "Saramago", 2000, 400);
		
		l1.realizarEmprestimo("Ensaio sobre a cegueira", 12);
		
		l1.realizarDevolucao("Ensaio sobre a cegueira", 13);
		
		l1.realizarDevolucao("Baratinha", 25);
		
	}
}