package day9.assignment;

//Write a program to calculate leap year.

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {

		int year;
		System.out.println("Enter an year: ");
		Scanner input = new Scanner(System.in);
		year = input.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("The enter year is a leap year.");
		else
			System.out.println("The enter year is not a leap year.");
	}

}
