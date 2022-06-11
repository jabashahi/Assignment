package day17.assignment;

public class Q36 {

	public static void main(String[] args) {
		
		int[] numArray = { 2, 3, 3, 4, 5, 5, 6, 7, 7, 8 };
		for (int i = 0; i <= numArray.length; i++) {

			for (int j = 1; j <= numArray.length; j++) {
				if (numArray[i] == numArray[j]) {
					
					System.out.println("Duplicat element is: " + numArray[j]);
				}
			}
		}

	}
}
