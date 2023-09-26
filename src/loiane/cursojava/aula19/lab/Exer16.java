package loiane.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[10];

		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Insert the value position: " + i);
			vetA[i] = scan.nextInt();
		}
		
		int smallerSum15 = 0;
		int biggerSum15 = 0;
		int quantityBig15 = 0;
		int equal15 = 0;
		
		for (int i = 0; i < vetA.length; i++) {
			
			if (vetA[i] == 15) {
				equal15 ++;
			} else if (vetA[i] < 15) {
				smallerSum15 += vetA[i];
			} else {
				quantityBig15 ++;
				biggerSum15 += vetA[i];
			}
		}
		
		System.out.print("Array = ");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Number of numbers equal to 15: " + equal15);
		System.out.println("Sum of numbers less than 15: " + smallerSum15);
		System.out.println("Average of numbers greater than 15: " + (biggerSum15 / quantityBig15));
		scan.close();

	}

}
