package main;

public class FindDuplicateStringsInWord {

	public static void main(String[] args) {

		String[] stringArray = "one two two three three three four four four four one five six six".split(" ");

		int count = 1;
		for (Integer i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(" ")) {
				continue;
			}
			for (Integer j = i + 1; j < stringArray.length; j++) {

				if (stringArray[i].equals(stringArray[j])) {
					count = count + 1;
					stringArray[j] = " ";

				}
			}
			System.out.println(" " + stringArray[i] + " " + count);
			stringArray[i] = " ";
			count = 1;
		}

	}

}
