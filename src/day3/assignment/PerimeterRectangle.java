package day3.assignment;

import java.util.Scanner;

public class PerimeterRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, l, b, peri;
		System.out.println("Enter value for length and breadth :");
		l = input.nextInt();
		b = input.nextInt();
		peri = 2*(l*b);
		a = l*b;
		//formula
		System.out.println("Area of a rectangle is: " + a);
		System.out.println("Area of Perimeter of a rectangle is: " + peri);
		input.close();
	}

}
