package day17.assignment;

import java.util.Scanner;

public class Q35 {

	public static int getSecondHighest(int arr[]) {
		int firstHighest = arr[0];
		int secondHighest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstHighest) {
				secondHighest = firstHighest;
				firstHighest = arr[i];
			} else if (arr[i] > secondHighest) {
				secondHighest = arr[i];

			}
		}
		return secondHighest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Sceond highest number " + getSecondHighest(arr));

	}

}
