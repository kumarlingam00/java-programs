import java.util.*;
public class FindSmallestElement2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		for(int i = 0; i < arr.length; i++) {
			System.out.print("Array  [" + i + "]  = "  );
			arr[i] = sc.nextInt();
		}
		int small = arr[0];
		for(int j = 1; j < arr.length; j++) {
			if(arr[j] < small) {
				small = arr[j];
			}
		}

		System.out.println("Smallest element in array  : " + small);
	}
}