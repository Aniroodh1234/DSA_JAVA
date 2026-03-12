import java.util.*;
public class pallindrome{
    public static boolean checkpallindrome(String name){
        boolean pallindrome = true;
        int start = 0;
        int end = name.length()-1;
        while(start<end){
            if(name.charAt(start) != name.charAt(end)){
                pallindrome = false;
                break;
            }
            start++;
            end--;
        }
        return pallindrome;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean pal = checkpallindrome(name);

        if(pal==true){
            System.out.print("This is a pallindrome");
        }
        else{
            System.out.print("Not a pallindrome");
        }
    }
}