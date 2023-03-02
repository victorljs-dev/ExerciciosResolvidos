package Resolvidos2;

import java.util.Scanner;

public class Ex003 {
	public static void main(String[] args) {
		 
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.print("Digite a altura em cm: ");
		 double altura = ler.nextDouble();
		 
		 System.out.print("Digite a base maior em cm: ");
		 double bMaior = ler.nextDouble();
		 
		 System.out.print("Digite a base menor em cm: ");
		 double bMenor = ler.nextDouble();
	 
		 double area = ((bMaior + bMenor) * altura) / 2;
		 
		 System.out.println("A área do trapézio retângulo é: " + area + "cm²");
	}
}
