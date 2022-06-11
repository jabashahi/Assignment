package day30.assignment;

import java.util.Scanner;

public class Q39 {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		name = sc.nextLine();
		int len = name.length();
		name = name.trim();
		String s1 = "";

		for (int i = 0; i < len; i++) {
			char ch = name.charAt(i);
			if (ch != ' ') {
				s1 = s1 + ch;
			} else {
				System.out.print(Character.toUpperCase(s1.charAt(0)) + ". ");
				s1 = "";
			}
		}

		String s2 = "";
		for (int j = 0; j < s1.length(); j++) {
			if (j == 0)
				s2 = s2 + Character.toUpperCase(s1.charAt(0));
			else
				s2 = s2 + Character.toLowerCase(s1.charAt(j));
		}

		System.out.println(s2);
	}

}
