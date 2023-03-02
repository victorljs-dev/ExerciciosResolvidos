package Resolvidos1;

import java.util.Random;

public class Ex008 {
	public static void main(String[] args) {
		int[] numeros = new int[100];
		int soma = 0;
		
		Random geraAleatorio = new Random();
		
		System.out.print("Números: ");
		
		for(int i = 0; i <= numeros.length -1; i++) {
			numeros[i] = geraAleatorio.nextInt(101);
			System.out.print(numeros[i] + " ");
			soma = soma + numeros[i];
		}
		
		System.out.println();
		System.out.println("Total: " + soma);
		
		double media = (double) soma / numeros.length;
		
		System.out.println("Média Aritimética: " + media);
	}
}
