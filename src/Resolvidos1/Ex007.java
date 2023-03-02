package Resolvidos1;

import java.util.Random;

public class Ex007 {
	public static void main(String[] args) {
		int[] numeros = new int[1];
		
		int maior = 0;
		int menor = 0;
		
		Random geraAleatorio = new Random();
		
		System.out.print("Números: ");
				
		for(int i = 0; i <= numeros.length -1; i++) {
			numeros[i] = geraAleatorio.nextInt(11);
			
			System.out.print(numeros[i] + " ");
			
			if(maior <= numeros[i]) {
				maior = numeros[i];
			} else {
				menor = numeros[i];
			}
		}
		
		System.out.println();
		System.out.println("O número maior foi: " + maior);
		System.out.println("O número menor foi: " + menor);
	}
}
