package lista05;
import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Contas> listaContas = new ArrayList<Contas>();
	private int numConta;
	
	public Banco() {
	
	}
	
	public void criarConta(double saldo, String nome, String cpf) {
		listaContas.add(new Contas(numConta, saldo, new Cliente(nome, cpf))); 
		this.numConta++;
	}
	
	public int acharConta(String cpf) {
		for(int i = 0; i < 10; i++){
			if((listaContas.get(i).getCpfCliente()).equals(cpf)){
				return i;
			}
		}
		return this.numConta;
	}
	
	public void verificarSaldo(String cpf) {
		
		System.out.println("saldo de " + listaContas.get(acharConta(cpf)).getSaldo());
	
	}
	
	public void realizarSaque(String cpf, double valor) {
		int indiceConta = acharConta(cpf);
		double saldoDaConta = listaContas.get(indiceConta).getSaldo();
		if(valor > saldoDaConta) {
			System.out.println("Saldo indisponivel");
		}else {
			listaContas.get(indiceConta).setSaldo(saldoDaConta - valor);
			System.out.println("novo saldo: " + listaContas.get(indiceConta).getSaldo());
		}
	}
	
	public void realizarDeposito(String cpf, double valor) {
		int indiceConta = acharConta(cpf);
		double saldoDaConta = listaContas.get(indiceConta).getSaldo();
		listaContas.get(indiceConta).setSaldo(saldoDaConta + valor);
		System.out.println("novo saldo da conta: " + listaContas.get(indiceConta).getSaldo());
	}
}
