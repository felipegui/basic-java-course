package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean validInformation = false;
		
		String name, password;
		
		do {
			System.out.print("Username: ");
			name = scan.next();
			
			System.out.print("Password: ");
			password = scan.next();
			
			if (name.equalsIgnoreCase(password)) {
				System.out.println("Password cannot be the same as username!");
			} else {
				validInformation = true;
				System.out.println("Username and password registered successfully!");
			}
		} while (!validInformation);
		
		scan.close();

	}

}
