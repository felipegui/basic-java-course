package loiane.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] ages = new int[10];

		for (int i = 0; i < ages.length; i++) {
			System.out.println("Inform the person's age: " + (i + 1));
			ages[i] = scan.nextInt();
		}
		
		int smaller = ages[0];
		
		int indexSmaller = 0;
		
		int greater = ages[0];
		
		int indexGreater = 0;
		
		for (int i = 1; i < ages.length; i++) {
			
			if (ages[i] > greater) {
				greater = ages[i];
				indexGreater = i;
			} else if (ages[i] < smaller) {
				smaller = ages[i];
				indexSmaller = i;
			}
		}
		
		System.out.print("Ages vector = ");
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Smaller age: " + smaller);
		System.out.println("Index smaller age: " + indexSmaller);
		System.out.println("Bigger age: " + greater);
		System.out.println("Index bigger age: " + indexGreater);
		
		scan.close();

	}

}
