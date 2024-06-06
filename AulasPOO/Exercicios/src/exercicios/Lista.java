package exercicios;
import java.util.List;

public class Lista {
	
	private List<Integer> l;
	
	public Lista(List<Integer> jorge) {
		this.l = jorge;
	}
	
	public int Soma() {
		int sum = 0;
		for(int a : l) {
			sum = a + sum;
		}
		return sum;
	}
	
	public double media() {
		int sum = 0;
		for(int a : l) {
			sum = a + sum;
		}
		return sum / l.size();
	}
}