package lista05;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	private List<Vagas> vagas = new ArrayList<Vagas>();
	private int qntVagas = 0;
	
	public void criarVaga(int numVaga) {
		vagas.add(new Vagas(numVaga, false));
		qntVagas++;
	}
	
	private int acharVaga(int numVaga) {
		for(int i = 0; i < qntVagas; i++) {
			if(vagas.get(i).getNumVaga() == numVaga) 
				return i;
		}
		return -1;
	}
	
	public void alocarVeiculoVaga(int numVaga, Veiculo v1, int horaInicial) {
		int j = acharVaga(numVaga);
		if(j == -1) {
			System.out.println("Vaga nao encontrada");
			return;
		}
		if(vagas.get(j).isOcupada()) {
			System.out.println("Essa vaga ja está ocupada");
			return;
		}else {
			vagas.get(j).setHoraInicial(horaInicial);
			vagas.get(j).setOcupada(true);
			vagas.get(j).setVeiculo(v1);
		}
	}
	
	public double calcularPreco(int horaInicial, int horaFinal) {	
			return 2 + (((horaFinal - horaInicial) - 3) * 0.5);
	}
	
	public void desalocarVeiculoVaga(int numVaga, String placa, int horaFinal) {
		int j = acharVaga(numVaga);
		if(j == -1){
			System.out.println("Vaga nao encontrada");
			return;
		}
		if(!vagas.get(j).isOcupada()) {
			System.out.println("Essa vaga nao contém veiculo");
			return;
		}else if(vagas.get(j).getVeiculo().getPlaca() != placa) {
			System.out.println("Esse veiculo nao pertence a essa vaga");
			return;
		}else if((horaFinal - vagas.get(j).getHoraInicial()) < 3) {
			System.out.println("O veículo precisa ficar pelo menos 3 horas");
			return;
		}else{
			vagas.get(j).setVeiculo(null);
			vagas.get(j).setOcupada(false);
			System.out.println("Vaga desalocada com sucesso");
			System.out.println("Preco a ser pago: " + calcularPreco(vagas.get(j).getHoraInicial(), horaFinal));
			return;
		}
	}
}
