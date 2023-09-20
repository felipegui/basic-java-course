package loiane.cursojava.aula18;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with a number:");
		int number = scan.nextInt();
		
		System.out.println("Enter a limit:");
		int max = scan.nextInt();
		
		for (int i = number; i <= max; i++) {
			System.out.println(i);
			
			if (i % 7 == 0) {
				System.out.println("The value i is: " + i);
				break;
			}
		}
		
		scan.close();

	}

}
