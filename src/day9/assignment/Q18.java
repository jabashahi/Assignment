package day9.assignment;

// Write a program to display the largest number from given three values.

public class Q18 {

	public static void main(String[] args) {

		int a = 5, b = 9, c = 3;
		if (a >= b && a >= c)
			System.out.println(a + " is the largest number ");

		else if (b >= a && b >= c)
			System.out.println(b + " is the largest number ");

		else
			System.out.println(c + "is the largest number ");
	}

}
