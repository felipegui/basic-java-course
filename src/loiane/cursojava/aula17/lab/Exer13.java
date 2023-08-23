package loiane.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sistema de potenciação");
		System.out.print("Base do número: ");
		int base = scan.nextInt();
		
		System.out.print("Potência do número: ");
		int potencia = scan.nextInt();
		
		int resultado = base;
		
		for (int i = 1; i < potencia; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado: " + resultado);
		
		scan.close();

	}

}
