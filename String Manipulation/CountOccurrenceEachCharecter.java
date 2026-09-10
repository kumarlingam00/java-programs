import java.util.*;
public class CountOccurrenceEachCharecter{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a string : ");
        String str = sc.nextLine();
        
        for(int i = 0; i < str.length(); i++){
            
            int count = 0;
            int j;
            for(j = 0; j < i; j++){
                if(str.charAt(i) == str.charAt(j)){
                    break;
                }
            }
            if(j < i){
                continue;
            }
            for(j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " = " + count);
        }
    }
}