package loiane.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Insert the value position: " + i);
			vetA[i] = scan.nextInt();
		}
		
		int counter = 0;
		for (int i = 0; i < vetA.length; i++) {
			if (vetA[i] % 2 == 0) {
				counter ++;
			}
		}
		
		System.out.println("Pair numbers: " + counter);
		
		scan.close();

	}

}
