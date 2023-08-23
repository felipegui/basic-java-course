package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Tabuada de: ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
		
		scan.close();

	}

}
