package loiane.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];

		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Inform the person's age: " + (i + 1));
			vetA[i] = scan.nextInt();
		}
		
		int ageOver35 = 0;
		
		for (int i = 0; i < vetA.length; i++) {
			
			if (vetA[i] > 35) {
				ageOver35 ++;
			}
		}
		
		System.out.print("Ages vector = ");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Numbers of people over 35 years old: " + ageOver35);
		
		scan.close();

	}

}
