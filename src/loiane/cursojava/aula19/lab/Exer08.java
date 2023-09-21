package loiane.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		int[] vetC = new int[vetA.length];
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Insert the value position: " + i + " (Array A)");
			vetA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetB.length; i++) {
			System.out.println("Insert the value position: " + i + " (Array B)");
			vetB[i] = scan.nextInt();
			
			vetC[i] = vetA[i] * vetB[i];
		}
		
		System.out.print("Array A = ");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Array B = ");
		for (int i = 0; i < vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Array C = ");
		for (int i = 0; i < vetC.length; i++) {
			System.out.print(vetC[i] + " ");
		}
		
		scan.close();

	}

}
