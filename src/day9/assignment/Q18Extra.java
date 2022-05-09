package day9.assignment;

// Write a program to display the largest number from given three values.

import java.util.Scanner;

public class Q18Extra {

	public static void main(String[] args) {
		
		int a, b, c, largest, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of a : ");
		a = input.nextInt();
		System.out.println("Enter the number of b : ");
		b = input.nextInt();
		System.out.println("Enter the number of c : ");
		c = input.nextInt();
		
		temp = a > b ? a : b;
		largest = c > temp ? c : temp;
		
		System.out.println("The largest number is :" + largest);

	}

}
