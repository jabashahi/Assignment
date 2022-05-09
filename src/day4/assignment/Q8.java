package day4.assignment;

//Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		//Create new Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the temperature in Fahrenheit
		System.out.println("Enter temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		//Formula (convert Fahrenheit into Celsius)
		double celsius = (( 5 *(fahrenheit - 32.0)) / 9.0);
		System.out.println(fahrenheit + " degree fahrenheit is equal to " + celsius + " degree in Celsius");

		//Prompt user to enter the temperature in Celsius
		System.out.println("Enter temperature in Celsius: ");
		double Celsius = input.nextDouble();
		
		//Formula (convert Celsius into Fahrenheit)
		double f = Celsius * (9f / 5) + 32;
		System.out.println(Celsius + " degree Celsius is equal to " + fahrenheit + " degree in Fahrenheit");

		input.close();
	}

	
	}

