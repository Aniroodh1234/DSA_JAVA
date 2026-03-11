import java.util.*;
public class lowercasestring{
    public static String countlowercase(String str){
        StringBuilder sb = new StringBuilder("");
        int count = 0;
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
                count++;
            }
        }
        System.out.println("number of lowercase in sentence: "+count);
        // return count;
        return sb.toString();
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // int c = countlowercase(str);
        String result = countlowercase(str);
        // System.out.print(c);
        System.out.println(result);



    }
}