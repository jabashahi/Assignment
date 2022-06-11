package day30.assignment;

public class Q42 {

	public static void main(String[] args) {
		String str = "Open the car and read the directions. Make the best of things.";
		int n;
		str = str.toUpperCase();
		String words[] = str.split(" ");
		System.out.println("Duplicate words in above string: ");
		
		for (int i = 0; i < words.length; i++) {
			n = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					n++;
					words[j] = "0";
				}
			}
			
			if (n > 1 && words[i] != "0")
				System.out.println(words[i]);
		}
	}

}
