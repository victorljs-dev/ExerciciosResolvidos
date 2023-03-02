package Resolvidos2;

import java.util.Scanner;

public class Ex004 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n1 = ler.nextInt();
		
		System.out.print("Digite outro número: ");
		int n2 = ler.nextInt();
		
		System.out.println();
		
		if(n1 > n2) {
			System.out.println("Maior: " + n1);
			System.out.println("Menor: " + n2);
		} else {
			System.out.println("Maior: " + n2);
			System.out.println("Menor: " + n1);
		}
   }
}
