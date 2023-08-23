package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i=0; i<5; i++) {
			System.out.println("Informe o número:");
			num = scan.nextInt();
			if (num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior número digitado foi: " + maior);
		
		scan.close();

	}

}
