package day11.assignment;

import java.util.Scanner;

//Write a program to sum each digit of given number as well as product. 
//456=>4*5*6 and 4+5+6

public class Q27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digits of sum and product: ");
		System.out.println("Enter number: ");
		int number = input.nextInt();

		int remainder, temp, sum = 0, product = 1;
		temp = number;

		while (temp != 0) {
			remainder = temp % 10;
			sum = sum + remainder;
			product = product * remainder;
			temp = temp / 10;

		}

		System.out.println("Sum of digits of number " + number + " : " + sum);
		System.out.println("Product of digits of number " + number + " : " + product);

		input.close();

	}

}
