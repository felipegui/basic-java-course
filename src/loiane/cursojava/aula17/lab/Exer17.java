package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number for factorial: ");
		int number = scan.nextInt();
		
		//System.out.println(number + "!");
		
		int factorial = 1;
		for (int i = number; i > 0; i--) {
			factorial *= i;
			System.out.println(i);
		}
		System.out.println("Result: " + factorial);
		
		scan.close();
	}

}
