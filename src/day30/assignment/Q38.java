package day30.assignment;

import java.util.Scanner;

public class Q38 {

	public static void main(String[] args) {
		String a, b = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		a = sc.nextLine();
		int num = a.length();
		
		for (int i = num - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println("The string is palindrome.");
		} else {
			System.out.println("The string is not palindrome.");
		}
	}

}
