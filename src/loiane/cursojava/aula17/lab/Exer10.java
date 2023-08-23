package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("De: ");
		int num1 = scan.nextInt();
		
		System.out.print("Até: ");
		int num2 = scan.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
