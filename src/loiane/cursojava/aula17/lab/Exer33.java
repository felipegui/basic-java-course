package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the value of n: ");
		double n = scan.nextDouble();
		
		double sum = 0;
		
		for (double i = 1.0, j = 1.0; i <= n; i++, j+=2.0) {
			System.out.print(i + "/" + j + " + ");
			
			sum += i / j;
		}
		
		System.out.println("\nTotal: " + sum);
		
		scan.close();
	}

}
