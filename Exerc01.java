package aula02;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int n1, n2, n3, invalidData;
		
		System.out.println("Digite numero inteiro:\n");
		n1 = read.nextInt();
		
		System.out.println("Digite outro numero:\n");
		n2 = read.nextInt();
		
		System.out.println("Digite novamente outro numero:\n");
		n3 = read.nextInt();
		
		if(n1 > n2 && n1 > n3 ) {
			System.out.println("Primeiro numero digitado é maior que segundo e terceiro numero digitado");
			
		}else {
			System.out.println("Primeiro numero digitado é menor que segundo e terceiro numero digitado");
		}
		
		if(n2 > n1 && n2 > n3 ) {
			System.out.println("Segundo numero digitado é maior que primeiro e terceiro numero digitado");
			
		}else {
			System.out.println("Segundo numero digitado é menor que primeiro e terceiro numero digitado");
		}
		
		if(n3 > n1 && n3 > n2 ) {
			System.out.println("Terceiro numero digitado é maior que primeiro e segundo numero digitado");
			
		}else {
			System.out.println("Terceiro numero digitado é menor que primeiro e segundo numero digitado");
		}
		/*if(n1 && n2 && n3 != n1 && n2 && n3) {
			System.out.println("Dados invalidos! Por favor digite numero inteiro.");
		}*/
	}

}
