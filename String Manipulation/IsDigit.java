import java.util.*;
public class IsDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        boolean isDigit = true;
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                isDigit = false;
                break;
            }
        }
        if(isDigit){
            System.out.println("String contains only digits");
        }
        else{
            System.out.println("String does not contains only digits");
        }
    }
}