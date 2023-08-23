package loiane.cursojava.aula17.lab;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);		
		
		String name, sex, maritalStatus;
		int age;
		double salary;
		
		boolean validInformation = false;
		
		do {
			System.out.print("Username: ");
			name = scan.next();
			
			if (name.length() < 3) {
				System.out.println("Username must be at least 3 characters!");
			} else {
				validInformation = true;
			}
		} while (!validInformation);
		
		validInformation = false;		
		do {
			System.out.print("Age: ");
			age = scan.nextInt();
			
			if (age >= 0 && age <= 100) {
				validInformation = true;				
			} else {
				System.out.println("Age needs to be between 0 and 100!");
			}
		} while (!validInformation);
		
		validInformation = false;		
		do {
			System.out.print("Salary: ");
			salary = scan.nextDouble();
			
			if (salary > 0) {
				validInformation = true;				
			} else {
				System.out.println("Salary must be greater than zero!");
			}
		} while (!validInformation);
		
		validInformation = false;		
		do {
			System.out.print("Sex: ");
			sex = scan.next();
			
			if (sex.equalsIgnoreCase("f") || sex.equalsIgnoreCase("m")) {
				validInformation = true;				
			} else {
				System.out.println("Just 'f' for female or 'm' for male");
			}
		} while (!validInformation);
		
		validInformation = false;		
		do {
			System.out.print("Marital Status: ");
			maritalStatus = scan.next();
			
			if (maritalStatus.equalsIgnoreCase("s") || 
				maritalStatus.equalsIgnoreCase("m") ||
				maritalStatus.equalsIgnoreCase("w") ||
				maritalStatus.equalsIgnoreCase("d")) {
				validInformation = true;				
			} else {
				System.out.println("S - Single, M - Married, W - Widowed, D - Divorced");
			}
		} while (!validInformation);
		
		System.out.println();
		System.out.println("The following information was collected:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Sex: " + sex);
		System.out.println("Marital status: " + maritalStatus);
		
		scan.close();
	}

}
