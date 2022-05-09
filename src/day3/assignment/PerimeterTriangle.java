package day3.assignment;

import java.util.Scanner;

public class PerimeterTriangle {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			double a, b, c, sp, area, peri;
			System.out.println("Enter three sides of triangle: ");
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			// formulla
			sp = (a + b + c)/2;
			area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
			peri = a + b + c;
			
			System.out.println("Area of triangle is: " + area);
			
			System.out.println("Perimeter of triangle :" + peri);
			

			input.close();
		}


	}


