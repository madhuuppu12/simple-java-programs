package apps;

public class Test {

	public static void main(String[] args) {

		int[] intArray = { 6, 9, 5, 2, 7 };

		int temp;

		for (int i = 0; i < intArray.length; i++) {

			for (int j = i + 1; j < intArray.length; j++) {

				if (intArray[i] < intArray[j]) {
					temp = intArray[j];
					intArray[j] = intArray[i];
					intArray[i] = temp;
				}

			}

		}
		System.out.println("Second Largest is " + intArray[1]);

	}

}
