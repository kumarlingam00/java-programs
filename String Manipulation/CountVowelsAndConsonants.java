import java.util.*;
public class CountVowelsAndConsonants{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string  : " );
        String str = sc.nextLine();
        
        int vowels = 0, nonVowels = 0;
        
        String vowelChar = "";
        String nonVowelChar = "";
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelChar = vowelChar + ch + "  ";
                vowels++;
            }
            else{
                nonVowelChar = nonVowelChar + ch + "  ";
                nonVowels++;
            }
        }
        System.out.println("Vowels  : " + vowelChar);
        System.out.println("Number of Vowels  : "+ vowels);
        
        System.out.println("Non vowels  : "+ nonVowelChar);
        System.out.println("Number of non-vowels  : " + nonVowels);
    }
}