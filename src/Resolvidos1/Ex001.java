package Resolvidos1;

import java.util.Scanner;

public class Ex001 {
 public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 
	 int[] notas = new int[5];
	 double soma = 0;
	 
	 for(int i = 0; i <= notas.length -1; i++) {
		 System.out.print("Digite a " + (i + 1) + "º nota: ");
		 notas[i] = ler.nextInt();
		 soma = soma + notas[i]; 
	 }
	 
	 double media = soma / notas.length;
	 
	 System.out.println("Sua média é: " + media);
 }
}
