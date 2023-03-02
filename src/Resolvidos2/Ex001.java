package Resolvidos2;

import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número do tipo int: ");
		int inteiro = ler.nextInt();
		
		System.out.println("Digite um número do tipo float: ");
		float flutuante = ler.nextInt();
		
		System.out.println("Digite um número do tipo long: ");
		long longo = ler.nextInt();
		
		System.out.println("O número do tipo int digitado foi: " + inteiro);
		System.out.println("O número do tipo float digitado foi: " + flutuante);
		System.out.println("O número do tipo long digitado foi: " + longo);
	}
}
