package day9.assignment;

//Program to input the number of (1...7) and translate to its 
//equivalent name of the day of the week.

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day number of the week.");
		int day = input.nextInt();
		switch (day) {// start

		case 1:
			System.out.println("Frist day name is Sunnday: ");
			break;
		case 2:
			System.out.println("Second day name is Monday: ");
			break;
		case 3:
			System.out.println("Third day name is Tuesday: ");
			break;
		case 4:
			System.out.println("Fourth day name is Wednesday: ");
			break;
		case 5:
			System.out.println("Fifth day name is Thrusday: ");
			break;
		case 6:
			System.out.println("Sixth day name is Friday: ");
			break;
		case 7:
			System.out.println("Seventh day name is Saturday: ");

			break;
		default:
			System.out.println("Wrong day!!!");
			break;
		} // end

		System.out.println("exit");
	}

}
