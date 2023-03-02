package Resolvidos1;

import java.util.Scanner;

public class Ex002 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 
		 int[] numeros = new int[10];
		 
		 System.out.println("Crescente:");
		 System.out.println();
		 
		 for(int i = 0; i <= numeros.length - 1; i++) {
			 System.out.print((i + 1) + "º número: ");
			 numeros[i] = ler.nextInt();
		 }
		 
		 System.out.println();
		 System.out.println("Descrescente:");
		 System.out.println();
		 
		 for(int i = numeros.length - 1; i >= 0; i--) {
			 System.out.println((i + 1) + "º número: " + numeros[i]);
		 }
	}
}
