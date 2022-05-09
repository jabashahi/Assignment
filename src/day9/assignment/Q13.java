package day9.assignment;

// Write a program to print the number entered by user only if the number entered is negative.

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		int number;
		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();

		if (number > 0) {
			System.out.println(number + " is a positive number ");
		}

		else if (number < 0) {
			System.out.println(number + " is a nagative number ");
		}

		else {
			System.out.println(number + " is neither positive nor negative ");

		}

	}

}
