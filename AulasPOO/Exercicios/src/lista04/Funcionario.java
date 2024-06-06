package lista04;

public class Funcionario {
	private int numeroRegistro;
	private String nome;
	private String dataNascimento;
	private boolean sexo;
	private String setor;
	private String telefone;
	Endereco end;
	public Funcionario(int numeroRegistro, String nome, String dataNascimento, boolean sexo, String setor,
			String telefone, Endereco end) {
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.end = end;
	}

}
