package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		boolean prime = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("It's not a prime number because it's divisible by: " + i);
				prime = false;
			}
		}
		
		if (prime) {
			System.out.println("Is prime number");
		}
		scan.close();

	}

}
