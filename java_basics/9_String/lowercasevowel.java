import java.util.*;
public class lowercasevowel{
    public static void lowervowel(String str){
        int count=0;
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'){
                if("aeiou".indexOf(ch)!=-1){
                    count++;
                }
            }
        }
        System.out.print("Number of lowercase vowels: "+count);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        lowervowel(str);
    }
}