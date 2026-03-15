import java.util.*;
public class stringcharAt{
    public static void printletters(String name){
        for(int i = 0; i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printletters(name);
    }
}