package Resolvidos2;

import java.util.Scanner;

public class Ex005 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
	}	
}
