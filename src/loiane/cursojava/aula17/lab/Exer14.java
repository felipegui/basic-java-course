package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Números: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Qnt de números pares: " + pares);
		System.out.println("Qnt de números ímpares: " + impares);
		
		scan.close();

	}

}
