package day11.assignment;

//Write a program to print the factorial number of given numbers.

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {

		long num, fact = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = input.nextLong();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("The factorial number is = " + fact);

		input.close();
	}

}
