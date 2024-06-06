package aula06;

public class Galinha {
	
	String nome;
	int quantidadeOvos;
	static int quantidadeOvosGranja;
	
	public void botar() {
		
		quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
