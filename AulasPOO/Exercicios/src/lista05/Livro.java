package lista05;

public class Livro {
	
	private String titulo, autor;
	private int anoPublicacao, numPagina, diaEmprestado, diaDevoluido;
	private boolean disponibilidade;
	
	
	public Livro(String titulo, String autor, int anoPublicacao, int numPagina, boolean disponibilidade, int diaEmprestado, int diaDevoluido) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.numPagina = numPagina;
		this.disponibilidade = disponibilidade;
		this.diaEmprestado = diaEmprestado;
		this.diaDevoluido = diaDevoluido;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public int getNumPagina() {
		return numPagina;
	}
	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public int getDiaEmprestado() {
		return diaEmprestado;
	}

	public void setDiaEmprestado(int diaEmprestado) {
		this.diaEmprestado = diaEmprestado;
	}

	public int getDiaDevoluido() {
		return diaDevoluido;
	}

	public void setDiaDevoluido(int diaDevoluido) {
		this.diaDevoluido = diaDevoluido;
	}
	
	
}
