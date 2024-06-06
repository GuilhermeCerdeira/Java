package aula08.exercicio1;

import java.util.Scanner;

public class StringTeste {
	
	public static void main(String[] args) {

		String gulp = "Osteoporose moderada difusa";
		System.out.println(gulp.charAt(3));
		System.out.println(gulp.length());
		System.out.println(gulp.toLowerCase());
		String [] dividida = gulp.split("");
		System.out.println(dividida[1]);
		System.out.println(dividida[2]);
		System.out.println(dividida[3]);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite para comparar");
		String gulp2 = input.nextLine();
		
		if(gulp2.equals(gulp)) {
			System.out.println("Iguais!");
		}else {
			System.out.println("Diferentes!");
		}
		

	}
}