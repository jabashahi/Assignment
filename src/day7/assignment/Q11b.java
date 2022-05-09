package day7.assignment;

import java.util.Scanner;

public class Q11b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		System.out.println("Value of a before swapping: " + a);
		System.out.println("Value of b before swapping: " + b);
		
		
		a = a + b;// 4 + 5 = 9
		b = a - b;// 9 - 5 = 4
		a = a - b;// 9 - 4 = 5
		
		System.out.println("Value of a before swapping: " + a);
		System.out.println("Value of b before swapping: " + b);
		
	}

}
