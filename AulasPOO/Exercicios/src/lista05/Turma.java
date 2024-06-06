package lista05;
import java.util.ArrayList;
import java.util.List;


public class Turma {
	private List<Alunos> classe = new ArrayList<Alunos>();
	int tamSala = 0;
	
	public void criarAluno(String nome, int ra, double n1, double n2, double n3, double n4) {
		if(tamSala > 4) {
			System.out.println("A sala está lotada");
			return;
		}					
		classe.add(new Alunos(nome, ra, n1, n2, n3, n4));
		tamSala ++; 
	}
	
	public int encontrarAluno(int ra) {
		for(int i = 0; i < tamSala; i++) {
			if((classe.get(i).getRa()) == (ra)){
				return i;
			}
		}
		return 6;
	}
	
	public double calcularMediaAluno(int ra) {
		int j = encontrarAluno(ra);
		if(j == 6) {
			System.out.println("Aluno nao encontrado");
			return 0.0;
		}
		double mediaAluno = (classe.get(j).n1 + classe.get(j).n2 + classe.get(j).n3 + classe.get(j).n4)  / 4;
		System.out.println("A media do aluno "+ j + " é " + mediaAluno);
		if(mediaAluno >= 6.0) {
			classe.get(j).setAprovado(true);
		}else {
			classe.get(j).setAprovado(false);
		}
		return mediaAluno;
	}
	
	public double calcularMediaTurma() {
		double mediaSala = 0;
		for(int i = 0; i< tamSala; i++) {	
			mediaSala = mediaSala + calcularMediaAluno(classe.get(i).getRa());
		}
		mediaSala = mediaSala / tamSala;
		System.out.println("A media da sala é: " + mediaSala);
		return mediaSala;
	}
}
