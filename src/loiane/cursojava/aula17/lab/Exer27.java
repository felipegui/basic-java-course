package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of temperatures: ");
		int qntTemperatures = scan.nextInt();
		
		double temp;
		double sum = 0;
		double bigger = Double.MIN_VALUE;
		double less = Double.MAX_VALUE;
		
		for (int i = 1; i <= qntTemperatures; i++) {
			System.out.print("Enter the temperature " + i + ": ");
			temp = scan.nextDouble();
			sum += temp;
			
			if (temp > bigger) {
				bigger = temp;
			}
			if (temp < less) {
				less = temp;
			}
		}
		
		System.out.println("Average: " + (sum / qntTemperatures));
		System.out.println("Higher temperature: " + bigger);
		System.out.println("Lower temperature: " + less);
		
		scan.close();

	}

}
