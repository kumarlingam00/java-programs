public class FindSecondLargeElement {
	public static void main (String[] args) {

		int arr[] =  {35, 73, 47, 38, 63, 92};

		int large = 0;
		int secondLarge = arr[0];
		
		for(int i = 0; i < arr.length; i++){
		    if(arr[i] > large){
		        secondLarge = large;
		        large = arr[i];
		    }
		    else if(arr[i] > secondLarge && arr[i] < large){
		        secondLarge = arr[i];
		    }
		    
		}
		System.out.println("Second Largest element in array  = " + secondLarge);
	}

}

