package lista05;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> lista = new ArrayList<Livro>();
	String titulo;
	int dia;
	boolean disponibilidade;
	int j;
	int diasTotais;
	private double multa;
	private int quantLivros;
	public Biblioteca() {
		
	}
	public void criarLivro(String titulo, String autor, int anoPublicacao, int numPagina){
		lista.add(new Livro(titulo, autor, anoPublicacao, numPagina, true, 0, 0)); 
		quantLivros++;
	}
	
	public int acharLivro(String titulo) {		
	    for (int i = 0; i < lista.size(); i++) { // assuming lista is a List<ObjectType>
	        Livro obj = lista.get(i);
	        if (obj.getTitulo().equals(titulo)) {
	            return i;
	        }
	    }
	    System.out.println("Livro não encontrado");
	    return -1;
	}

	
	public boolean verificarDisponibilidade(String titulo) {
		this.titulo = titulo;
		if(lista.get(acharLivro(this.titulo)).isDisponibilidade() == true){
			return true;
		}
		return false;
		
	}
	public void realizarEmprestimo(String titulo, int dia) {
		this.titulo = titulo;
		this.dia = dia;
		this.j = acharLivro(this.titulo);	
		if(this.j == -1)
			return;
		if(verificarDisponibilidade(this.titulo) == true) {
			lista.get(j).setDisponibilidade(false);
			lista.get(j).setDiaEmprestado(this.dia);
			System.out.println("Livro Emprestado");
		}
		else{
			System.out.println("Livro indisponivel");
		}
	}
	public void realizarDevolucao(String titulo, int dia) {
		this.titulo = titulo;
		this.dia = dia;
		this.j = acharLivro(this.titulo);
		if(this.j == -1) 
			return;
		lista.get(j).setDiaDevoluido(this.dia); 
		if(verificarDisponibilidade(this.titulo) == false) {
			this.diasTotais = lista.get(j).getDiaDevoluido() - lista.get(j).getDiaEmprestado();
			if(this.diasTotais > 7) {
				multa = (this.diasTotais - 7) * 1.50;
				System.out.println("Multa de " + multa);
			}
		}else if(verificarDisponibilidade(this.titulo) == true) {
			System.out.println("O livro nao foi emprestado");
			}
	}
}
