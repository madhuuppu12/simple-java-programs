package main;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindDuplicateStringsInWord {

	public static void main(String[] args) {
		String s = "one two two three three three four four four four one five six six";
		String[] stringArray = s.split(" ");
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
		stringArray = s.split(" ");
		HashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		for (Integer i = 0; i < stringArray.length; i++) {
			if (hm.containsKey(stringArray[i])) {
				hm.put(stringArray[i], hm.get(stringArray[i]) + 1);
			} else {
				hm.put(stringArray[i], 1);
			}
		}
		hm.entrySet().stream().forEach(c -> System.out.println(" " + c.getKey() + "  " + c.getValue()));

	}

}
