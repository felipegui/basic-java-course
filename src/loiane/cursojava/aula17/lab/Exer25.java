package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.out.println("Stores Tabajara");

		boolean exit = false;
		String continueShopping, output;
		int qntProducts;
		double price, amountPaid, change;
		double total;
		do {
			System.out.print("Do you want to report a new purchase? (y/n): ");
			continueShopping = scan.next();

			if (continueShopping.equalsIgnoreCase("y")) {
				output = "Stores Tabajara\n";

				System.out.print("Enter the quantity of products to be purchased: ");
				qntProducts = scan.nextInt();

				total = 0;
				for (int i = 1; i <= qntProducts; i++) {
					System.out.println("Enter price of product " + i + " $...");
					price = scan.nextDouble();
					total += price;
					output += "Product " + i + ": $ " + price + "\n";
				}

				output += "Total: $ " + total;
				System.out.println("Total: $ " + total);

				System.out.println("Enter the amount to be paid: ");
				amountPaid = scan.nextDouble();

				output += " - Cash: $ " + amountPaid + "\n";

				change = amountPaid - total;

				output += "Change: $ " + change;

				System.out.println(output);
			} else {
				exit = true;
			}
		} while (!exit);

		scan.close();

	}

}
