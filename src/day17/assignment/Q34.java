package day17.assignment;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.print("Enter the number of elements of an Array: ");
		n = sc.nextInt();
		int[] array = new int[n];
		int[] rev = new int[n];
		
		System.out.println("Enter the elements of an Array: ");
		for (i = 0; i < n; i++) {
			array[i] = sc.nextInt();

		}
		for (i = 0; i < n; i++) {
			rev[i] = array[n - i - 1];
		}

		System.out.println("Elements in Reverse of an array: ");
		for (i = 0; i < n; i++) {

			System.out.println(rev[i] + " ");
		}
	
	}
}
