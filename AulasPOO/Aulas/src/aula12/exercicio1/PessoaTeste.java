package aula12.exercicio1;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Guilherme", 21);
		pessoa1.imprimirDado();
		Professor professor1 = new Professor("Professor", 30, 8000, 200);
		professor1.calcularSalario();
		professor1.imprimirDados();
		Aluno aluno1 = new Aluno("Jorge", 20, "Matematica");
		aluno1.realizarMatricula("Computacao");
		aluno1.imprimirDados();
	}
}
