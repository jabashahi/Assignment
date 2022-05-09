package day3.assignment;

import java.util.Scanner;

public class RectangleDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l, b, a2;
		System.out.println("Enter value for length and breadth :");
		l = input.nextInt();
		b = input.nextInt();
		a2 = l*b;
		//formula
		System.out.println("Area of rectangle is: " + a2);
		input.close();
	}

}
