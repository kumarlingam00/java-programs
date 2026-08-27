import java.util.*;
public class FindDuplicates1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[6];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Array [" + i +"]  = " );
			arr[i] = sc.nextInt();
		}

		for(int j = 0; j < arr.length; j++) {

			for(int k = j + 1; k < arr.length; k++ ) {
				if(arr[j] == arr[k]) {
					System.out.println("Duplicate elements : " + arr[j]);
				}
			}
		}
	}

}

