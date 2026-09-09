import java.util.*;
public class FindAscii{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a charecter : ");
        char ch = sc.next().charAt(0);
        
        int ascii = ch;
        
        System.out.println("Assici value of given integer : " + ascii);
    }
}