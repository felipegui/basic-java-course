package loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			System.out.println("i has value of: " + i);			
		}
		
		for (int i=0, j=10; i<j; i++, j--) {
			System.out.println("i = " + i + " j = " + j);
		}
		
		int i = 0;
		for ( ; i < 10;) {
			System.out.println("Value: " + i);
			i+=2;
		}
		
		for (int i_i=0; i_i<10; i_i+=2) {
			System.out.println("Value: " + i_i);
		}
		
		int sum = 0;
		for (int j=1; j<5; sum = sum += j++);
		System.out.println("Sum is: " + sum);
	}

}
