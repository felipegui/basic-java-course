package loiane.cursojava.aula17.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salary = 1000;
		
		double percentage = 1.5;
		
		salary += (salary / 100) * percentage;
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for (int i = 1997; i <= 2015; i++) {
			percentage *= 2;
			
			salary += (salary / 100) * percentage;
			
			System.out.println(i + " = " + format.format(salary) + " - " + percentage + "%");
		}
		
		scan.close();

	}

}
