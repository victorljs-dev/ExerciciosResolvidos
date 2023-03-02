package Resolvidos1;

import java.util.Random;

public class Ex003 {
	public static void main(String[] args) {
		int[] numeros = new int[100];
		Random geraAleatorio = new Random();
		
		System.out.print("Ordem padrão: ");
		
		for(int i = 0; i <= numeros.length -1; i++) {
			numeros[i] = geraAleatorio.nextInt(100);
			
			System.out.print(numeros[i] + " ");

		}
		
		System.out.println();
		System.out.println();
		System.out.print("Ordem inversa: ");

		for(int i = numeros.length -1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
	}
}
