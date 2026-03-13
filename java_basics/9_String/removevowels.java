import java.util.*;
public class removevowels{
    public static String novowel(String name){
        // String str1 = "";
        int count = 0;
        StringBuilder sb = new StringBuilder("");  // using string builder
        for(int i = 0; i<name.length();i++){
            char ch = name.charAt(i);
            if("AEIOUaeiou".indexOf(ch)==-1){
                // str1 = str1+ch;
                sb.append(ch);
                count++;
            }
        }
        System.out.println("Vowels are: "+count);
        // return str1;
        return sb.toString();   // string builder is converted into strings
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String result = novowel(name);
        System.out.println("Senetence without vowels are: "+result);
    }
}