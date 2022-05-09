package day5.assignment;

//Write a Program for the following Mathematical Function.
//s = ut+1/2a+^2

import java.util.Scanner;

public class Q10a {

	public static void main(String[] args) {
		//// Create new Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the velocity, acceleration and time.
		System.out.println("enter the velocity: ");
		double u = input.nextDouble();
		System.out.println("Enter the acceleration: ");
		double a = input.nextDouble();
		System.out.println("Enter the time: ");
		double t = input.nextDouble();

		// formula of distance covered
		double s = u * t * +0.5 * a * t * t;
		System.out.println("Total distance velocity = " + s);

		input.close();
	}

}
