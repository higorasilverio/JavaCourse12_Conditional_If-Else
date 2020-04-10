package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Interval check: 0 to 100 ***");
		System.out.println();
		System.out.print("Enter the number to check the interval: ");
		double number = scanner.nextDouble();
		if(number >= 0 && number <= 25) System.out.println("Interval [0,25]");
		else if (number > 25 && number <= 50) System.out.println("Interval ]25,50]");
		else if (number > 50 && number <= 75) System.out.println("Interval ]50,75]");
		else if (number > 75 && number <= 100) System.out.println("Interval ]75,100]");
		else System.out.println("Out of interval!");
		
		scanner.close();
	}

}
