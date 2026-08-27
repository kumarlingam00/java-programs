import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string  : " );
		String str = sc.nextLine();

		String result = "";

		for(int i = 0; i < str.length(); i++) {
			int count = 0;

			for(int j = 0; j < i ; j++) {

				if(str.charAt(i) == str.charAt(j)) {
					count++;
					break;
				}
			}
			if(count == 0 ) {
				result = result + str.charAt(i);
			}
		}

		System.out.println("string after removing duplicates  : " + result);
	}
}