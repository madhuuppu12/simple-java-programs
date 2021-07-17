package apps;

public class RemoveDuplicateStringsFromWord {

	public static void main(String[] args) {
		String s = "one two two three three three four four four four one five six six";
		String[] stringArray = s.split(" ");
		System.out.println("Original String " + s);
		System.out.println("After Duplicates Removal ");
		int count = 1;
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(" ")) {
				continue;
			}
			for (Integer j = i + 1; j < stringArray.length; j++) {

				if (stringArray[i].equals(stringArray[j])) {
					count = count + 1;
					if (count > 1) {
						stringArray[j] = " ";
					}
				}
			}
			System.out.print(" "+stringArray[i]);
		}
	}
}
