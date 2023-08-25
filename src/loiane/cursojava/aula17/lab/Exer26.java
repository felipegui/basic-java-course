package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		System.out.println("Factorial of: " + num);
		
		System.out.print(num + "! = ");
		
		int factorial = 1;
		for (int i = num; i > 1; i--) {
			factorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.print(" 1 = " + factorial);
		
		scan.close();

	}

}
