import java.util.*;
public class PrimeNumbersBetweenRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter minimum value : ");
        int min = sc.nextInt();
        
        System.out.print("Enter Maximum value : " );
        int max = sc.nextInt();
        
        for(int i = min; i <= max; i++){
            int count = 0;
            
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i + " ");
            }
        }
    }
}