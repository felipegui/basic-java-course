package loiane.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Insert the value position: " + i);
			vetA[i] = scan.nextInt();
		}
		
		double oddNumbers = 0.0;
		for (int i = 0; i < vetA.length; i++) {
			
			if (vetA[i] % 2 != 0) {
				oddNumbers += vetA[i];
			}
		}
		
		System.out.print("Array = ");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Total odd numbers: " + oddNumbers);
		System.out.println("Media: " + oddNumbers / 2);
		
		scan.close();

	}

}
