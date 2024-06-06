package exercicios;

public class Relogio {
	private String marca;
	private int hora;
	private int minuto;
	
	public Relogio(String marca, int hora, int minuto){
		this.marca = marca;
		this.hora = hora;
		this.minuto = minuto;
	}
	public int getHora() {
		return this.hora; 
	}
	public void setHora(int hora) {
		if(hora >= 0 && hora < 24 ) {
			this.hora = hora;
		}
		else {
			System.out.println("Numero invalido!");
		}
	}
	public int getMinuto() {
		return this.minuto; 
	}
	public void setMinuto(int minuto) {
		if(minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}
		else {
			System.out.println("Numero invalido!");
		}
	}
	public String getMarca() {
		return this.marca;
	}
	
}
