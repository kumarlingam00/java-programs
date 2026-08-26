import java.util.*;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        if(number <= 1){
            System.out.println("its not a prime number");
            return;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                System.out.println("its not a prime number");
                return;
            }
        }
        System.out.println("it is a prime number");
    }
}