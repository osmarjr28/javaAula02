package aula02;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite numero:\n");
		n = read.nextInt();
		
		if(n % 2 == 0 ) {
			System.out.println("Digite é par." +"E raiz quadrada" + " = " + n*n);
	
		}else {
			System.out.println("Digite é impar");
		}
	}

}
