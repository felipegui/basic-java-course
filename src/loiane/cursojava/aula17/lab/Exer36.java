package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = scan.nextInt();

		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += 1 / i;
		}

		System.out.println("Total: " + sum);

		scan.close();

	}

}
