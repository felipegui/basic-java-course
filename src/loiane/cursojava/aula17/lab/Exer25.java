package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Stores Tabajara");
		
		boolean exit = false;
		String continueShopping;
		do {
			System.out.println("Do you want to report a new purchase");
			continueShopping = scan.next();
			
			if (continueShopping.equalsIgnoreCase("s"));
		} while (!exit);
		
		scan.close();

	}

}
