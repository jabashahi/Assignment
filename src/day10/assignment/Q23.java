package day10.assignment;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {

		int number, i, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = input.nextInt();
		
		for(i = 1; i <= number; i++) 
		{
			sum = sum+i;
		}
			
			System.out.println("sum of natural numbers " + number + " = " + sum);
		}
}
