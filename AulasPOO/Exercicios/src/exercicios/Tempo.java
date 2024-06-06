package exercicios;
import java.util.ArrayList;
import java.util.List;

public class Tempo {
	public static void main(String[] args) {
		List<Integer> lita = new ArrayList<Integer>();
		long inicio = System.currentTimeMillis();
		for(int i = 0; i < 500000; i++) {
			lita.add(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println(tempo + "ms");
	}
}
