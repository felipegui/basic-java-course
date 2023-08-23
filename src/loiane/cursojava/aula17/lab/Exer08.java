package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num;
		double soma = 0.0;
		double media;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um número: ");
			num = scan.nextInt();
			
			soma += num;
		}
		
		media = soma / 5;
		
		System.out.println("Total: " + soma);
		System.out.println("Média: " + media);
		
		scan.close();

	}

}
