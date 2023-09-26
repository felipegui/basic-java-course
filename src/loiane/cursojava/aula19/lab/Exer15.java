package loiane.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[10];

		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Insert the value position: " + i);
			vetA[i] = scan.nextInt();
		}
		
		int pair = 0;
		for (int i = 0; i < vetA.length; i++) {
			
			if (vetA[i] % 2 == 0) {
				pair ++; 
			}
		}
		
		int odd = vetA.length - pair;
		
		double percentageOdd = (odd * 100) / vetA.length;
		
		double percentagePair = 100 - percentageOdd;
		
		System.out.print("Array = ");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Percentage Pair: " + percentagePair + "%");
		System.out.println("Percentage Odd: " + percentageOdd + "%");
		
		scan.close();

	}

}
