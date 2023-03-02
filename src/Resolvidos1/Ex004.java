package Resolvidos1;

import java.util.Random;

public class Ex004 {
	public static void main(String[] args) {
		int[] numeros = new int[100];
		
		Random geraAleatorio = new Random();
		
		System.out.print("Numeros primos: ");
		
		for(int i = 0; i <= numeros.length -1; i++) {
			numeros[i] = geraAleatorio.nextInt(101);
			boolean ehPrimo = true;
			
			for(int j = 2; j < numeros[i]; j++) {
				if(numeros[i] % j == 0) {
					ehPrimo = false;
				}
			}
			
			if(ehPrimo && numeros[i] > 1) {
				System.out.print(numeros[i] + " ");
			}
		}
	}
}
