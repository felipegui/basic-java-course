package loiane.cursojava.aula17.lab;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		boolean validGrade = false;
		
		do {
			System.out.print("Enter a note: ");
			double note = scan.nextDouble();
			
			if (note >= 0 && note <= 10) {
				validGrade = true;
				System.out.println("You typed: " + note);
			} else {
				System.out.println("Invalid grade, type again...");
			}
		} while (!validGrade);
		
		scan.close();
	}

}
