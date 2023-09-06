package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		System.out.println("Pick a number.");
		int n1 = in.nextInt();
		System.out.println("Pick another number.");
		int n2 = in.nextInt();
		
		System.out.println("The average of " + n1 + " and " + n2 + " is " + ((double) n1 / 2 + (double) n2 / 2));


		
	}

}
