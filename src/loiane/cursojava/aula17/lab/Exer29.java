package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			boolean prime = true;
			
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					prime = false;
				}
			}
			
			if (prime) {
				System.out.println(i);
			}
		}
		
		scan.close();

	}

}
