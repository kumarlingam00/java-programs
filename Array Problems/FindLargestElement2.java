import java.util.*;
public class FindLargestElement2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		int large = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Array [" + i + "]  = " );
			arr[i]  = sc.nextInt();
		}

		for(int j = 0; j < arr.length; j++) {
			if(arr[j] > large) {
				large = arr[j];
			}
		}
		System.out.println("Largest element in array : "+ large);
	}
}