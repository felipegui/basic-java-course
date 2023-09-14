package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = scan.nextInt();

		double sum = 0;

		for (double i = 1, j = 1; i <= n; i++, j += 2) {
			System.out.print(i + "/" + j + " + ");

			sum += i / j;
		}

		System.out.println("\nTotal: " + sum);

		scan.close();

	}

}
