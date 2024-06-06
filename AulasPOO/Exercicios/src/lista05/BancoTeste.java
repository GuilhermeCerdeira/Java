package lista05;

public class BancoTeste {
	public static void main(String[] args) {
		Banco itau = new Banco();
		
		itau.criarConta(8000.0, "Eloá Moreira Machado", "422.171.178-74");
		
		itau.verificarSaldo("422.171.178-74");
		
		itau.realizarSaque("422.171.178-74", 20.00);
		
		itau.realizarDeposito("422.171.178-74", 20.00);
	}
}
