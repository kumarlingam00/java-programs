public class StringPalindrome {
	public static void main (String[] args) {
		String str = "malayalam";
		String reverse = "";
		String original = str;
		for(int i = str.length() -1 ; i >= 0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		if(reverse.equals(original)) {
			System.out.println("This string is palindrome");
		}
		else {
			System.out.println("This string is not a palindrome");
		}

	}
}