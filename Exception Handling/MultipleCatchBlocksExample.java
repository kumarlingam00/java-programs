import java.util.*;
public class MultipleCatchBlocksExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
    
        try{
            int num = sc.nextInt();
            int result = num / 4;
            
            int[] arr = new int[4];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30; 
            arr[3] = 40;
            arr[4] = 50;
            
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Once check the denominator");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Once check the array elements");
        }
        finally{
            sc.close();
            System.out.println("Program execution compleated");
        }
    }
}