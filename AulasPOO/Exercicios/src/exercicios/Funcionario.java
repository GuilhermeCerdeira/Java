package exercicios;

public class Funcionario {
	private int numero, telefone;
	private String nome, dataDeNascimento, setor, rua, numeroEndereco, bairro, cidade, estado;
	boolean sexo;
	public Funcionario(int numero, int telefone, String nome, String dataDeNascimento, String setor, String rua, String numeroEndereco, String bairro, String cidade, String estado, Boolean sexo){
		this.numero = numero;
		this.telefone = telefone;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.setor = setor;
		this.rua = rua;
		this.numeroEndereco = numeroEndereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.sexo = sexo;
	}
	public String getNome() {
		return this.nome;
	}
	
	
	
	
}
