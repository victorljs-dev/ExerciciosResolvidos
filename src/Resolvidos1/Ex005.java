package Resolvidos1;

import java.util.Random;

public class Ex005 {
	public static void main(String[] args) {
	
		int[] numeros = new int[100];
		
		Random geraAleatorio = new Random();
		
		System.out.print("Números ímpares: ");
		
		for(int i = 0; i <= numeros.length -1; i++) {
			numeros[i] = geraAleatorio.nextInt(101);
			
			if(numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}
	}
}
