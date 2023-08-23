package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many people were at the event? ");
		int ages = scan.nextInt();
		
		int age;
		int sum = 0;
		for (int i = 0; i < ages; i++) {
			System.out.println("Enter with age of the person: " + (i + 1));
			age = scan.nextInt();
			
			sum += age;
		}
		
		double average = sum / ages;		
		System.out.println("Average of ages: " + average);
		
		if (average >= 0 && average <= 25) {			
			System.out.println("Public Young");
		} else if (average >= 26 && average <= 60) {			
			System.out.println("Public Adult");
		} else {
			System.out.println("Public Old");
		}
		
		scan.close();
	}

}
