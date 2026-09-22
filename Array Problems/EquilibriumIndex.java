public class EquilibriumIndex{
    public static void main(String[] args){
        int[] arr = {1, 7, 3, 6, 5, 6};
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum = totalSum + arr[i];
        }
        
        int leftSum = 0; 
        for(int i = 0; i < arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];
            
            if(leftSum == rightSum){
                System.out.println("Index = " + i);
                break;
            }
            leftSum = leftSum + arr[i];
        }
    }
}