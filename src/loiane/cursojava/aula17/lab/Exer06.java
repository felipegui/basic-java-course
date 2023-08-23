package loiane.cursojava.aula17.lab;

public class Exer06 {

	public static void main(String[] args) {
		
		int i = 1;
		System.out.println("While:");
		while (i <= 20) {
			System.out.println(i);
			i++;
		}

		System.out.println("Do While:");
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 20);

		System.out.println("For:");
		for (i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}
	}

}
