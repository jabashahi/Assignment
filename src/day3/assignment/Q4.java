
package day3.assignment;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter p: ");
		//principal amount
		int p = input.nextInt();
		System.out.println("Enter r: ");
		//rate per annum
		int r = input.nextInt();
		System.out.println("Enter t: ");
		//time
		int t = input.nextInt();
		
		int si = p*r*t/100;
		//simple interest 
		System.out.println("Simple interest is: " + si);
		System.out.println("Simple interest " + p + r + " and " + t + " is: " + si);
		
		input.close();
		
	}

}
