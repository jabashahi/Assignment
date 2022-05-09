package day9.assignment;

/*
 * Write a program to find the given number is even or odd.
 */

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = input.nextInt();

		if (a % 2 == 0) {
			System.out.println("The given number is :" + a + " Even ");
		} else {
			System.out.println("The given number is: " + a + " Odd ");
		}

		System.out.println("exit");
	}

}
