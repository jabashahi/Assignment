package day3.assignment;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = input.nextInt();
		System.out.println("Enter number2: ");
		int number2 = input.nextInt();
		
		int sum = number1 + number2;
		System.out.println("Sum of number1 and number2 is: " + sum);
		System.out.println("Sum of " + number1 + " and " + number2 + " is: " + sum);
		
		int avg = sum/2;
		System.out.println("Average of number1 and number2 is: " + avg );
		System.out.println("Average of " + number1 + " and " + number2 + " is " + avg);
		input.close();
		
	}

}
