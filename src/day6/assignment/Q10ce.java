package day6.assignment;

import java.util.Scanner;

public class Q10ce {

	public static void main(String[] args) {
                //Create new Scanner object
				Scanner input = new Scanner(System.in);
				
				//Prompt user to enter the number of pounds
				System.out.println("Enter the alue of a: ");
				double a = input.nextDouble();
				System.out.println("Enter the value of b: ");
				double b = input.nextDouble();
				System.out.println("Enter the value of c: ");
				double c = input.nextDouble();
				
				//Discriminant(d) formula
				double d = b * b - 4.0 * a * c;
				
				if (d > 0.0) {
					double root1 = (-b +Math.pow(d,0.5)) / (2.0 * a);
					double root2 = (-b -Math.pow(d,0.5)) / (2.0 * a);
					System.out.println("The roots are" + root1 + " and " + root2);
				}
				
				else if (d == 0.0) {
					double root1 = -b/(2.0 *a);
					System.out.println("The root is " + root1);
				}
				
				else {
					System.out.println("The roots are not real");
				}
				
				
				input.close();
			}

		

}


