package lista05;

public class Vagas {

	private int numVaga;
	private Veiculo veiculo;
	private boolean ocupada;
	private int horaInicial;
	private int horaFinal;
	
	public Vagas(int numVaga, boolean ocupada) {
		this.numVaga = numVaga;
		this.ocupada = ocupada;
		this.veiculo = null;
	}
	
	public boolean isOcupada() {
		return ocupada;
	}
	
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public int getNumVaga() {
		return numVaga;
	}

	public void setNumVaga(int numVaga) {
		this.numVaga = numVaga;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public int getHoraInicial() {
		return horaInicial;
	}
	
	public void setHoraInicial(int horaInicial) {
		this.horaInicial = horaInicial;
	}
	
	public int getHoraFinal() {
		return horaFinal;
	}
	
	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}

}
