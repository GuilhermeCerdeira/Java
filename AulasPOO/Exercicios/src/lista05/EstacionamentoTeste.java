package lista05;

public class EstacionamentoTeste {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("PYH8805");
		Estacionamento e1 = new Estacionamento();
		e1.criarVaga(5);
		e1.alocarVeiculoVaga(5, v1, 10);
		e1.desalocarVeiculoVaga(5, "P123105", 14);
		e1.desalocarVeiculoVaga(5, "PYH8805", 14);	

	}
}
