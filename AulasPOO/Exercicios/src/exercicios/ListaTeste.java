package exercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTeste {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> listaInteiro = new ArrayList<Integer>();
		listaInteiro.add(s.nextInt());
		listaInteiro.add(s.nextInt());
		listaInteiro.add(s.nextInt());
		listaInteiro.add(s.nextInt());
		listaInteiro.add(s.nextInt());
		
		Lista l = new Lista(listaInteiro);
		System.out.println(l.Soma());
		System.out.println(l.media());
	}
	
}
