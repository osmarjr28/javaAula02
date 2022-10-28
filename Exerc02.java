package aula02;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite numero:\n");
		n1 = read.nextInt();
		
		System.out.println("Digite numero:\n");
		n2 = read.nextInt();
		
		System.out.println("Digite numero:\n");
		n3 = read.nextInt();

		
		for(int i = 0; i <=10; i++) {
			System.out.println(i + "" + n1);
			
		}
	}
}