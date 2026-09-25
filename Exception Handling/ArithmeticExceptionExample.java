import java.util.*;
public class ArithmeticExceptionExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        
        int num = sc.nextInt();
        try{
            int result = num / 0;
            System.out.println("result : " + result);
            
        }
        catch(ArithmeticException e){
            System.out.println("once check the denomonater");
        }
        finally{
            sc.close();
            System.out.println("termination compleated");
        }
    }
}