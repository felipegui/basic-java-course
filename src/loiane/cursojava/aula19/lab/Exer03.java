package loiane.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[15];
		double[] vetB = new double[vetA.length];
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Enter the position value: " + i);
			vetA[i] = scan.nextInt();
			
			vetB[i] = Math.pow(vetA[i], 2);
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
		
		scan.close();

	}

}
