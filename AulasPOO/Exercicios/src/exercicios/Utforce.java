package exercicios;

public class Utforce {

	private int velocidade;
	private int marcha;
	
	public Utforce() {
		this.velocidade = 0;
		this.marcha = 0;
	}
	public void acelerar() {
		if(this.velocidade < 90) {
			this.velocidade += 10;	
		}
		else{
			System.out.println("Carro já está na velocidade limite");
		}
		checarMarcha();
		
	}
	public void desacelerar() {
		if(velocidade > 0) {
			this.velocidade -= 5;
		}
		else {
			System.out.println("O carro está parado!");
		}
		checarMarcha();
	}
	public void checarMarcha() {
		if(this.velocidade > 0 && this.velocidade < 20) {
			this.marcha = 1;
		}else if(this.velocidade > 19 && this.velocidade < 40) {
			this.marcha = 2;
		}else if(this.velocidade > 39 && this.velocidade < 60) {
			this.marcha = 3;
		}else if(this.velocidade > 59 && this.velocidade < 90) {
			this.marcha = 4;
		}else if(this.velocidade == 90) {
			this.marcha = 5;
		}
	}
	public int getMarcha() {
		return this.marcha;
	}
	public int getVelocidade() {
		return this.velocidade;
	}
}
