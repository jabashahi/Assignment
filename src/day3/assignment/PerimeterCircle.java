package day3.assignment;

import java.util.Scanner;

public class PerimeterCircle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius :");
		double radius = input.nextDouble();
		System.out.println("Perimeter of the circle having radius "+ radius + " is: " + (2*Math.PI * radius));

		input.close();
	}

}
