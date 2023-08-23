package loiane.cursojava.aula17.lab;

public class Exer16 {

	public static void main(String[] args) {
		int one = 1;
		int two = 1;
		int next = 0;
		
		System.out.println(one);
		System.out.println(two);
		
		while (next < 500) {
			next = one + two;
			one = two;
			two = next;
			System.out.println(next);
		}
	}

}
