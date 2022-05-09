package day5.assignment;
//Write a program that reads the radius and length of a cylinder and computes volume.

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		//Value of PI
		final double PI = 3.14159265359;
		
		//Prompt user to enter the radius and length of a cylinder
		System.out.println("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		//The area and volume formula
		double area = radius * radius * PI;
		double volume = area * length;
		
		//Result
		System.out.println("The volume is " + volume);
		
		input.close();
		
	}

}
