package aula07.exercicio1;


public class PessoaTeste {
	public static void main(String[] args) {
	Pessoa pessoa1 = new Pessoa("João", 25, 68.5);
	Pessoa pessoa2 = new Pessoa("Maria", 30, 55.6);
	Pessoa pessoa3 = new Pessoa("José", 32, 68.2);
	
	
	System.out.println(pessoa1);
	System.out.println(pessoa2);
	System.out.println(pessoa3);
	
	pessoa1.andar();
	pessoa2.correr();
	pessoa3.falar();

	}
}
