package loiane.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[5];
		int[] vetB = new int[vetA.length];

		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Enter the position value: " + i);
			vetA[i] = scan.nextInt();
			
			vetB[i] = vetA[i];
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
		
		scan.close();
	}
}
