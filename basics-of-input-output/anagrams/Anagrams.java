import java.util.*;

public class Anagrams {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int j = 0; j < t; j++) {
			String a = in.next();
			String b = in.next();
			int[] a_letters = new int[26];
			int[] b_letters = new int[26];
			int count = 0;

			int i = 0;
			while (i < a.length()) {
				a_letters[a.charAt(i) - 'a']++;
				i++;
			}
			i = 0;
			while (i < b.length()) {
				b_letters[b.charAt(i) - 'a']++;
				i++;
			}

			for (i = 0; i < 26; i++) {
				if (a_letters[i] > b_letters[i])
					count += a_letters[i] - b_letters[i];
				else if (b_letters[i] > a_letters[i])
					count += b_letters[i] - a_letters[i];
			}
			System.out.println(count);
		}
		in.close();
	}
}
