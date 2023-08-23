package loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int count = 1;
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while (count <= max) {
			System.out.println("Número: " + count);
			count++;
		}

		System.out.println("Número: " + count + " (não entra no loop while)");
		
		do {
			count ++;
			System.out.println("Número: " + count);
		} while (count < 15);
		
		System.out.println("Número: " + count + " (não entra no loop do-while)");
	}

}
