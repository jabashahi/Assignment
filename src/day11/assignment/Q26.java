package day11.assignment;

//Write a program to reverse the given number.
// 123=> 321

public class Q26 {

	public static void main(String[] args) {
// prompt user input value
		int num = 123, reversed = 0;
		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}
		System.out.println("reversed number: " + reversed);

	}
}
