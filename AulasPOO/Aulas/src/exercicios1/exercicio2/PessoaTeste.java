package exercicios1.exercicio2;

public class PessoaTeste {
	public static void main(String[] args) {
	Pessoa pessoa1 = new Pessoa();
	Pessoa pessoa2 = new Pessoa();
	Pessoa pessoa3 = new Pessoa();
	
	pessoa1.nome = "João";
	pessoa1.sexo = false;
	pessoa1.cpf = 77966827;
	pessoa1.idade = 25;
	pessoa1.altura = 1.98;
	pessoa1.peso = 68.5;
	
	pessoa2.nome = "Maria";
	pessoa2.sexo = true;
	pessoa2.cpf = 921839;
	pessoa2.idade = 30;
	pessoa2.altura = 1.38;
	pessoa2.peso = 55.6;
	
	pessoa3.nome = "José";
	pessoa3.sexo = true;
	pessoa3.cpf = 7146892;
	pessoa3.idade = 32;
	pessoa3.altura = 1.68;
	pessoa3.peso = 68.2;
	
	System.out.println("===========Pessoa1==========");
	System.out.println("Nome: " + pessoa1.nome);
	System.out.println("Sexo: " + pessoa1.sexo);
	System.out.println("Cpf: " + pessoa1.cpf);
	System.out.println("Idade: " + pessoa1.idade);
	System.out.println("Altura: " + pessoa1.altura);
	System.out.println("Peso: " + pessoa1.peso);

	System.out.println("===========Pessoa2==========");
	System.out.println("Nome: " + pessoa2.nome);
	System.out.println("Sexo: " + pessoa2.sexo);
	System.out.println("Cpf: " + pessoa2.cpf);
	System.out.println("Idade: " + pessoa2.idade);
	System.out.println("Altura: " + pessoa2.altura);
	System.out.println("Peso: " + pessoa2.peso);

	System.out.println("===========Pessoa3==========");
	System.out.println("Nome: " + pessoa3.nome);
	System.out.println("Sexo: " + pessoa3.sexo);
	System.out.println("Cpf: " + pessoa3.cpf);
	System.out.println("Idade: " + pessoa3.idade);
	System.out.println("Altura: " + pessoa3.altura);
	System.out.println("Peso: " + pessoa3.peso);
	}
}
