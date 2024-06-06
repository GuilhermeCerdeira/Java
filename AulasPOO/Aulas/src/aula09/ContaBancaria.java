package aula09;

public class ContaBancaria {
	
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String titular) {
	
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0.00;
	}
	public void Sacar(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	public void Depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso");
		this.CalcularRendimento();
	}
	
	public void ImprimirSaldo() {
		
		System.out.println("===========\\===========");
		System.out.println("Número da conta: "+ this.numeroConta);
		System.out.println("Nome do titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("===========\\===========");
	}
	private void CalcularRendimento() {
		
		this.saldo *= 1.10;
	}
	public void setTitular(String titular) {
		
		this.titular = titular;
	}
	
	public String getTitular() {
		
		return this.titular;
	}
}
