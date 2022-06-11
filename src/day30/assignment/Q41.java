package day30.assignment;

public class Q41 {

	public static void main(String[] args) {
		String s1 = "Never put off till tomorrow what you can do today.";
		char[] arr = s1.toCharArray();
		System.out.println("String is: " + s1);
		System.out.print("Duplicate letters in above word are: ");

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j] + " ");
					break;
				}
			}
		}
	}

}
