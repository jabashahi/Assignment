package day9.assignment;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter 3 sides of triangle: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if (a < b + c && b < a + c && c < a + b) {
			
			if ( a == b && b == c )
				System.out.println("Equilateral triangle: ");
			
			else if ( a == b || b == c || c == a)
				System.out.println("Isosceles triangle: ");
			
			else 
				System.out.println("Scalene triangle: ");
		}
		else
				System.out.println("Cannot from a triangle: ");
				
		}

	}


