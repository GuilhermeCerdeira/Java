package aula08.exercicio2;

import java.util.Scanner;

public class MatematicaTeste {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira dois numeros inteiros");
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println("Raiz quadrada de a: " + Math.sqrt(a));
		System.out.println("a elevado a b: " + Math.pow(a, b));
		
		System.out.println("Insira um valor em graus de um ângulo");
		int c = input.nextInt();
		
		double d = (c * 180.0) / Math.PI;
		
		System.out.println("Seno do ângulo informado: " + Math.sin(d));
		System.out.println("Cosseno do ângulo informado: " + Math.cos(d));
		System.out.println("Tangente do ângulo informado: " + Math.tan(d));
	}
}