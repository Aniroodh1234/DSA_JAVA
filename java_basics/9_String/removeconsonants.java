import java.util.*;
public class removeconsonants{
    public static String noconsonants(String str){
        StringBuilder sb = new StringBuilder("");
        int count=0;
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1){
                sb.append(ch);
                count++;
            }
        }
        System.out.println("consonants are: "+count);
        return sb.toString();
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = noconsonants(str);
        System.out.println("Senetence without consonants: "+result);
    }
}