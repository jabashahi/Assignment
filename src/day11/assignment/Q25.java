package day11.assignment;

//Write a program that prompts the user to enter the number of students and
//each student's name and score. Finally display the student with the highest score.

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int num = input.nextInt();
		int max = 0;
		String maxName = "";

		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the name and score of student: " + (i));
			String name = input.next();
			int score = input.nextInt();
			if (score > max) {
				max = score;
				maxName = name;

			}
		}

		System.out.println("The student name with the highest score is : " + maxName);
		System.out.println("The highest score is: " + max);

		input.close();
	}

}
