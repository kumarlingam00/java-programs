public class FindLargestElement{
    public static void main(String[] args){
        int nums[] = {40,67,83,47,29,43,65};
        int largest = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        
        System.out.println("Largest element in array  : " + largest);
    }
}