import java.util.*;
public class uppercasestring{
    public static String countuppercase(String str){
        StringBuilder sb = new StringBuilder("");
        int count = 0;
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                sb.append(ch);
                count++;
            }
        }
        System.out.println("number of uppercase in sentence: "+count);
        // return count;
        return sb.toString();
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // int c = countuppercase(str);
        String result = countuppercase(str);
        // System.out.print(c);
        System.out.println(result);



    }
}