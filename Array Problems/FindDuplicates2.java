public class FindDuplicates2 {
	public static void main (String[] args) {

		int arr[] =  {10,45,10,57,45,37};

		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate elements = "+ arr[i]);
				}
			}
		}
	}

}

