package main;

public class Main {

	static double[] outcome = new double[12];
	
	static double[] outcome1 = new double[12];

	public static void main(String[] args) {
		
		Euler(10, 10);
		
		Heun(10, 10);
		
	}

	public static void Euler(int b, int N) {

		int h = b/N;
		outcome[0] = 1;
		double x = 0;
		double radians;
		
		for (int i = 1; i <= 10; i++) {

			radians = Math.toRadians(x);
			

			outcome[i] = outcome[i - 1] + h * (4 * Math.sin(radians) * Math.cos(radians));
						
			x=(x+1) *h;

			System.out.println("Euler:    "+outcome[i]);
			
		}

	}
	
	
	public static void Heun(int b, int N) {
		
		int h = b/N;
		outcome[0] = 1;
		double x = 0;
		double fp;
		double radians;
		
		for (int i = 1; i <= 10; i++) {

			radians = Math.toRadians(x);								
			
			fp = Math.toRadians(outcome[i]);
			
			outcome1[i] = outcome1[i - 1] + h*((4 * Math.sin(radians) * Math.cos(radians))+(4 * Math.sin(fp) * Math.cos(fp)))/2;
			
			
			x=(x+1) *h;
			
			System.out.println("Heun:    "+outcome1[i]);
			
		}

	}
	
	
	
}
