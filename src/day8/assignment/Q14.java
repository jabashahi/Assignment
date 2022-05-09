package day8.assignment;

import java.util.Scanner;

// Write a program to relate two integers entered by the user using == or > or < sign.

public class Q14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter the integer of a: ");
		a = input.nextInt();
		System.out.println("Enter the integer of b: ");
		b = input.nextInt();
		
		if (a == b) {
		System.out.println("a is equial to b.");
		}
		
		if (a > b) {
		System.out.println(" a is greater than b. ");
		}
		
		if (a < b) {
			System.out.println(" b is smaller than a");
		}

		System.out.println("exit");

	}

}

