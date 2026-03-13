import java.util.*;
public class Stringbasics{
    public static void main(String[]args){
        // manual input
        // String str = "xyx";  
        // System.out.print(str);

        // auto input
        Scanner sc = new Scanner(System.in);
    //     String name = sc.next();
        String name = sc.nextLine();
        System.out.println(name);
        System.out.print(name.length());
    }
}