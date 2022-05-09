package day3.assignment;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r;
		double PI = 3.14;
		double a;
		System.out.println("Enter radius of cirlec : ");
		r = input.nextInt();
		a = r*r*3.14;
		//formula
		System.out.println("Area of circle is: " + a);
		
		input.close();
	}

}
