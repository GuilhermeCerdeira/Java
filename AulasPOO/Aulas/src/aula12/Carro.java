package aula12;

public class Carro extends Veiculo{
	
	private int numeroPortas;
	
	public Carro(String modelo, String fabricante, int anoFabricacao, int numeroPassageiros, String combustivel) {
		super(modelo, fabricante, anoFabricacao, numeroPassageiros, combustivel);
		
		this.numeroPortas = numeroPortas;
	}
	
	public void calibrarPneus() {
		
		System.out.println(this.fabricante + this.modelo + " está calibrando os pneus");
	}


}
