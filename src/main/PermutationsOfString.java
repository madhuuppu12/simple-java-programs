package apps;

public class PermutationsOfString {

	public static void main(String[] args) {

		String str = "ABC";
		int end = str.length();
		permute(str, 0, end - 1);
	}

	private static void permute(String str, int start, int end) {
		if (start == end)
			System.out.println(str);
		else {
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permute(str, start + 1, end);
				str = swap(str, start, i);
			}
		}
	}

	static String swap(String s, int start, int end) {
		char temp;

		char[] c = s.toCharArray();
		temp = c[start];
		c[start] = c[end];
		c[end] = temp;
		s = String.valueOf(c);

		return s;
	}

}