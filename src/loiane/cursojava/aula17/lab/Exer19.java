package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many grades do you want to average? ");
		int notes = scan.nextInt();
		
		double sum = 0;
		double media, note;
		
		for (int i = 0; i < notes; i++) {
			System.out.println("Enter with the note: " + (i + 1));
			note = scan.nextDouble();
			sum += note;
		}
		
		media = sum / notes;
		
		System.out.println("Sum: " + sum);
		System.out.println("Media: " + media);
		scan.close();

	}

}
