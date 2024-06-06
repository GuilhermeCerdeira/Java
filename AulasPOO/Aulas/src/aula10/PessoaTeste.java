package aula10;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Endereco end = new Endereco("Vicente balbla", 1023, "city", "pg", "parana");
		Pessoa p1 = new Pessoa("Guilherme", "20/07","Masculino", "guilhermando@gmail.com", "Solteiro", end);
		
		p1.imprimirDados();
	}

}
