package loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Tabajara Butcher Shop");

		System.out.println();
		
		System.out.println("1 - double fillet");
		System.out.println("2 - rump");
		System.out.println("3 - rump steak");
		
		System.out.println();
		
		System.out.print("Enter the type of meat: ");

		int typeMeat = scan.nextInt();

		System.out.print("Enter the quantity (Kg): ");
		double qntKg = scan.nextDouble();

		double priceKg = 0;

		if (typeMeat == 1) {

			System.out.println(qntKg + " Kg - double fillet");
			
			if (qntKg < 5) {
				priceKg = 4.9;
			} else {
				priceKg = 5.8;
			}
		} else if (typeMeat == 2) {

			System.out.println(qntKg + " Kg - rump");
			
			if (qntKg < 5) {

				priceKg = 5.9;
			} else {

				priceKg = 6.8;
			}
		} else if (typeMeat == 3) {

			System.out.println(qntKg + " Kg - rump steak");
			
			if (qntKg < 5) {

				priceKg = 6.9;
			} else {

				priceKg = 7.8;
			}
		}

		double total = qntKg * priceKg;
		System.out.println(qntKg + " Kg * " + priceKg + "/Kg = R$" + total);
		
		System.out.print("Card purchase (Enter 1 for yes): ");
		int card = scan.nextInt();
		
		if (card == 1) {
			double discount = (total / 100) * 5;
			System.out.println("Discount of: R$" + discount);
			System.out.println("Total payable: R$" + (total - discount));
		} else {
			System.out.println("Total payable: R$" + total);
		}
		
		scan.close();

	}

}
