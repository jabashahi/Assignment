package day5.assignment;

import java.util.Scanner;

//Write a program that converts pounds into kg.
//The program prompts the user to enter a number of pounds, converts it to kg and 
//displays the result [1 pound is 0.454 kg].

public class Q9 {

	public static void main(String[] args) {

		//Create new Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the number of pounds
		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		//Formula (convert pounds into kilograms)
		double kilograms = pounds * 0.454;
		System.out.println(pounds + " Pounds is " + kilograms + "kilograms");
		
		input.close();
	}

}
