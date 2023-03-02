package Resolvidos2;

import java.util.Scanner;

public class Ex002 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double peso = ler.nextInt();
		
		System.out.print("Digite sua altura: ");
		double altura = ler.nextInt();
		
		double imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + imc);
    }
}
