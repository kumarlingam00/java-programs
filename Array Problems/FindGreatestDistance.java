public class FindGreatestDistance{
    public static void main(String[] args){
        int arr[] = {3,9,50,99,7,98,65};
         
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("greatest distance  : " + min + ", "+ max);
    }
}