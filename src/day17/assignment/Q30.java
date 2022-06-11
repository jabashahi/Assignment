package day17.assignment;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		int number, a = 1, b = 1, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			
			System.out.println(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

}
