package loiane.cursojava.aula17.lab;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);		
		
		boolean valid = false;
		
		double popA, popB, taxA, taxB;
		int count = 0;
		
		do {
			System.out.println("Inform population A:");
			popA = scan.nextDouble();
			
			if (popA > 0) {
				valid = true;
			} else {
				System.out.println("Population cannot be greater than 0.");
			}
		} while (!valid);
		
		valid = false;
		do {
			System.out.println("Inform population B:");
			popB = scan.nextDouble();
			 if (popB > 0) {
				 valid = true;
			 } else {
				 System.out.println("Population cannot be greater than 0.");
			 }
		} while (!valid);
		
		valid = false;
		do {
			System.out.println("Enter the population growth rate A:");
			taxA = scan.nextDouble();
			
			if (taxA > 0) {
				valid = true;
			} else {
				System.out.println("The growth rate must be greater than 0.");
			}
		} while (!valid);
		
		valid = false;
		do {
			System.out.println("Enter the population growth rate B:");
			taxB = scan.nextDouble();
			
			if (taxB > 0) {
				valid = true;
			} else {
				System.out.println("The growth rate must be greater than 0.");
			}
		} while (!valid);
		
		while (popA < popB) {
			popA += (popA / 100) * taxA;
			popB += (popB / 100) * taxB;
			count ++;
		}
		
		System.out.println("Population A: " + popA);
		System.out.println("Population B: " + popB);
		System.out.println("Amount of years: " + count);
		
		scan.close();
	}

}
