import java.util.*;
public class anagram{
    public static void anagram(String str1, String str2){
        String str1_new = str1.toLowerCase();
        String str2_new = str2.toLowerCase();

        if(str1_new.length()==str2_new.length()){
            char str1_char[] = str1_new.toCharArray();
            char str2_char[] = str2_new.toCharArray(); 
            

            Arrays.sort(str1_char);
            Arrays.sort(str2_char);

            boolean isanagram = Arrays.equals(str1_char, str2_char);
            if(isanagram==true){
                System.out.print("Its an anagram");
            }
            else{
                System.out.print("Not an anagram");
            }
        }
        else{
            System.out.print("Not an anagram");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        anagram(str1,str2);

    }
}