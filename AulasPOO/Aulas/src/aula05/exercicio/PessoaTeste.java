package aula05.exercicio;

public class PessoaTeste {
	public static void main(String[] args) {
	Pessoa pessoa1 = new Pessoa();
	Pessoa pessoa2 = new Pessoa();
	Pessoa pessoa3 = new Pessoa();
	
	pessoa1.nome = "João";
	pessoa1.idade = 25;
	pessoa1.peso = 68.5;
	
	pessoa2.nome = "Maria";
	pessoa2.idade = 30;
	pessoa2.peso = 55.6;
	
	pessoa3.nome = "José";
	pessoa3.idade = 32;
	pessoa3.peso = 68.2;
	
	System.out.println(pessoa1);
	System.out.println(pessoa2);
	System.out.println(pessoa3);
	
	pessoa1.andar();
	pessoa2.correr();
	pessoa3.falar();

	}
}
