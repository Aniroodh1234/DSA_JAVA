import java.util.*;
public class substring{
    public static void substring(String name, int si, int ei){
        String s = "";
        for(int i =si;i<ei;i++){
            s = s + name.charAt(i);
        }
        System.out.print(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // substring(str, 0,5);

        // java has inbuild function to find the substring for a string
        String str_new = str.substring(0, 5);
        System.out.print(str_new);
    }
}