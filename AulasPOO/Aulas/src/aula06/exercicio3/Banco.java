package aula06.exercicio3;

public class Banco {

	int numeroConta;
	String nomeTitular;
	double saldo;
	static int quantidadeContas;
	
	public void instanciarConta(){
		numeroConta++;
		quantidadeContas++;
	}
}
