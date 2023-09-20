package loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		double[] temperatures = new double[365];
		
		temperatures[0] = 31.3;
		temperatures[1] = 32;
		temperatures[2] = 33.7;
		temperatures[3] = 34;
		temperatures[4] = 33.1;
		
		//System.out.println("The temperatures value for day 05 is: " + temperatures[4] + "°C");
		
		System.out.println("The size of my array is: " + temperatures.length + " positions");
		
//		for (int i = 0; i < temperatures.length; i++) {
//			System.out.println("The temperatures value for day " + (i + 1) + " is: " + temperatures[i] + "°C");
//		}
		
		for (double temp : temperatures) {
			System.out.println(temp);
		}
	}

}
