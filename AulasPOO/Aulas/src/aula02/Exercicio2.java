package aula02;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n1, n2, n3, n4;
		
		System.out.println("Insira três números");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		
		n4 = n1;
		if(n4 < n2) {
			n4 = n2;
		}
		if(n4 < n3) {
			n4 = n3;
		}
		System.out.println("O maior número inserido foi " + n4);
	}
}
