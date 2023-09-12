package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notFinish = true;
		int cod, qtd;
		double total = 0;
		String output = "";
		
		do {
			System.out.println("Enter the product code and quantity. Or press 0 and press enter twice to exit the program.");
			cod = scan.nextInt();
			qtd = scan.nextInt();
			
			//Ends the program
			if (cod == 0 && qtd == 0) {
				notFinish = false;
				output += "Total payable: " + total;
			} else {
				
				if (cod == 100) {
					output += "Hot Dog -> 1,20 * " + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if (cod == 101) {
					output += "Simple Bauru -> 1,30 * " + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if (cod == 102) {
					output += "Bauru with Egg -> 1,50 * " + qtd;
					output += " = " + (1.5 * qtd) + "\n";
					total += 1.5 * qtd;
				} else if (cod == 103) {
					output += "Burger -> 1,20 * " + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if (cod == 104) {
					output += "Cheeseburger -> 1,30 * " + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if (cod == 105) {
					output += "Refrigerator -> 1,00 * " + qtd;
					output += " = " + (1.0 * qtd) + "\n";
					total += 1.0 * qtd;
				}
			}
		} while (notFinish);
		
		System.out.println(output);
		
		scan.close();

	}

}
