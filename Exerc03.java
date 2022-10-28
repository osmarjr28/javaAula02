package aula02;


import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int age;
		
		System.out.println("Digite sua idade(anos):\n");
		age = read.nextInt();
		
		if(age >= 10 && age <= 14) {
			System.out.println("Sua categoria é infantil");
		}
		
		if(age >= 15 && age <= 17) {
			System.out.println("Sua categoria é juvenil");
		}
		
		if(age >= 18) {
			System.out.println("Sua categoria é adulto");
		}else {
			System.out.println("Sua idade não apta a categoria (infatil, juvenil ou adulto)");
		}
		
	}

}
