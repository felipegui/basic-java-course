package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of CDs: ");
		int cds = scan.nextInt();
		
		double price, average;
		double sum = 0;
		for (int i = 1; i <= cds; i++) {
			System.out.println("Enter the value of the CD: " + i);
			price = scan.nextDouble();
			sum += price;
		}
		
		average = sum / cds;
		System.out.print("Average spent on each CD: " + average);
		
		scan.close();

	}

}
