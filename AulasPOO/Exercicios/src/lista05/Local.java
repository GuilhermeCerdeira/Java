package lista05;

public class Local {
	String nome, endereco;
	int capacidadeMax;
	public Local(String nome, String endereco, int capacidadeMax) {
		this.nome = nome;
		this.endereco = endereco;
		this.capacidadeMax = capacidadeMax;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCapacidadeMax() {
		return capacidadeMax;
	}
	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
}
