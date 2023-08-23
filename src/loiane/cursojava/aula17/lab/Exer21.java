package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter with number of existing classes: ");
		int numClasses = scan.nextInt();
		
		int numStudents;
		int sum = 0;
		boolean invalid = true;
		
		for (int i = 1; i <= numClasses; i++) {
			invalid = true;
			do {
				System.out.println("Enter with the number of students in the class: " + i);
				numStudents = scan.nextInt();
				
				if (numStudents <= 40) {
					invalid = false;
				} else {
					System.out.println("Invalid number of students. Type it again.");
				}
			} while (invalid);
			
			sum += numStudents;
		}
		
		double average = sum / numClasses;
		
		System.out.println("Average: " + average);
		
		scan.close();
	}

}
