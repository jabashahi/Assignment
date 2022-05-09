package day9.assignment;

/* Write a program to create the equivalent of a four-function calculator.
 *  The program to enter two integer's numbers and an operator. 
 * It then carries out the specified arithmetic operator operation: 
 * addition, subtraction, multiplication or division of the two numbers. 
 * Finally, it displays the result.
 */

import java.util.Scanner;

public class Q20Extra {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Operation: ");
		char operator = input.next().charAt(0);
		
		int a = 0, b = 0;
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {//logic
		System.out.println("Enter a : ");
		a = input.nextInt();
		System.out.println("Enter b : ");
		b = input.nextInt();
		}
		switch (operator) {
		case '+':
			int sum = a + b;
			System.out.println("Sum is : " + sum);
			break;
		case '-':
			int sub = a - b;
			System.out.println("Subtraction is : " + sub);
			break;
		case '*':
			int mul = a * b;
			System.out.println("Multipication is : " + mul);
			break;
		case '/':
			int div = a / b;
			System.out.println("Division is : " + div);
			break;
		default:
			System.out.println("Wrong operator selection!!!");
		}
		System.out.println("exit");

	}

}
