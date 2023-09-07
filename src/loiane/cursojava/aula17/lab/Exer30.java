package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number to generate the table: ");
		int num = scan.nextInt();

		boolean invalid = true;
		int numStart, numEnd;
		do {
			System.out.print("Enter the beginning of the table: ");
			numStart = scan.nextInt();

			System.out.print("Enter the end of the table: ");
			numEnd = scan.nextInt();

			if (numEnd > numStart) {
				invalid = false;
			}
		} while (invalid);

		System.out.println("Table of " + num + ":");
		System.out.println("Start with: " + numStart);
		System.out.println("End in: " + numEnd);
		System.out.println();
		
		for (int i = numStart; i <= numEnd; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		scan.close();

	}

}
