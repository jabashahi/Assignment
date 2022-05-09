package day3.assignment;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		//Create new Scanner object
		Scanner input = new Scanner(System.in);
		int a, b, c, sp;
		double a3;
		
		//Prompt user to enter the value of sides
		System.out.println("Enter value of sides: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		//formula
		sp = (a+b+c)/2;
		a3 = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.println("Area of triangle is: " + a3);
		
		input.close();
	}

}
