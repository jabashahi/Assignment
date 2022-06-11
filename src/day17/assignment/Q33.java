package day17.assignment;

public class Q33 {

	public static void main(String[] args) {

		int[] arr = new int[] { 3, 4, 5, 6, 7 };
		int temp;
		System.out.print("Enter the number of elements of an Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println();
			System.out.println("Elements of an Array Ascedning order: ");
			for (i = 0; i < arr.length; i++) {

				System.out.println(arr[i] + " ");
			}

		}

	}

}
