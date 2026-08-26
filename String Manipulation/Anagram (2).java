import java.util.*;
public class Anagram {
	public static void main (String[] args) {
		String str1 = "silent";
		String str2 = "listen";

		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();

		Arrays.sort(s1);
		Arrays.sort(s2);

		if(Arrays.equals(s1, s2)) {
			System.out.println("two strings are anagram");
		}
		else {
			System.out.println("two strings are not anagram");
		}

	}
}