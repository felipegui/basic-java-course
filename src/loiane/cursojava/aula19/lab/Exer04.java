package loiane.cursojava.aula19.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[15];
		double[] vetB = new double[vetA.length];
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Enter the position value: " + i);
			vetA[i] = scan.nextInt();
			
			vetB[i] = Math.sqrt(vetA[i]);
		}
		
		System.out.print("Array A = ");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Array B = ");
		for (int i = 0; i < vetB.length; i++) {
			System.out.print(df.format(vetB[i]) + " ");
		}
		
		scan.close();

	}

}
