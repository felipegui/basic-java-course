package loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Did you call the victim? ");
		String res1 = scan.next();
		
		System.out.println();
		
		System.out.print("Were you at the crime scene? ");
		String res2 = scan.next();
		
		System.out.println();
		
		System.out.print("Do l live near the victim? ");
		String res3 = scan.next();
		
		System.out.println();
		
		System.out.print("Owed to the victim? ");
		String res4 = scan.next();
		
		System.out.println();
		
		System.out.print("Have you ever worked with the victim? ");
		String res5 = scan.next();
		
		System.out.println();
		
		int counter = 0;
		
		if (res1.equalsIgnoreCase("yes")) {
			counter++;
		}
		
		if (res2.equalsIgnoreCase("yes")) {
			counter++;
		}
		
		if (res3.equalsIgnoreCase("yes")) {
			counter++;
		}
		
		if (res4.equalsIgnoreCase("yes")) {
			counter++;
		}
		
		if (res5.equalsIgnoreCase("yes")) {
			counter++;
		}
		
		if (counter == 2) {
			System.out.println("Suspect");
		} else if (counter == 3 || counter == 4) {
			System.out.println("Accomplice");
		} else if (counter == 5) {
			System.out.println("Assassin");
		} else if (counter == 0 || counter == 1) {
			System.out.println("Innocent");
		}
		
		scan.close();
	}

}
