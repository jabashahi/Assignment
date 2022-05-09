package day6.assignment;

import java.util.Scanner;

public class Q10b {

	public static void main(String[] args) {
		
		//Create new Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the value of a, b, and c
		System.out.println("Enter the value of a: ");
		double a = input.nextDouble();
		System.out.println("Enter the value of b: ");
		double b = input.nextDouble();
		System.out.println("Enter the value of c: ");
		double c = input.nextDouble();
		
		//formula
		double s = (a+b+c)/2;
		double area = Math.sqrt(s * (s - a) * (s - b)*(s - c));
		System.out.println("Area of triangle is: " + area);
		
		// formula of PI
		final double PI = Math.PI;
		
		input.close();
	}

}
