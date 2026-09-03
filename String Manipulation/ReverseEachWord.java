import java.util.*;
public class ReverseEachWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence  : ");
        String str = sc.nextLine();
        
        String [] words = str.split(" ");
        
        String reverse = "";
        
        for(String word : words){
            
            for(int i = word.length() -1; i >= 0; i--){
                reverse = reverse + word.charAt(i);
            }
            reverse = reverse + "  ";
        }
        System.out.print("reversde sentence  : " + reverse);
    }
}