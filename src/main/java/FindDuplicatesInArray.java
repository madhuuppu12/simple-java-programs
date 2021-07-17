package main.java;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		char[] charArray = "This is a better way to write a program Language".toCharArray();
		int count = 1;
		for (Integer i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				continue;
			}
			for (Integer j = i + 1; j < charArray.length; j++) {

				if (charArray[i] == (charArray[j])) {
					count = count + 1;
					charArray[j] = ' ';

				}
			}
			System.out.println(" " + charArray[i] + " " + count);
			charArray[i] = ' ';
			count = 1;
		}

	}

}
