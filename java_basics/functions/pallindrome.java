import java.util.*;
public class pallindrome{
    public static boolean pal(int x){
        int reverse = 0;
        int c = x;
        while(x!=0){
            int a = x%10;
            reverse = reverse*10 + a;
            x = x/10;
        }
        if (reverse==c) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check pallindrome: ");
        int n = sc.nextInt();
        boolean p = pal(n);
        System.out.print("The pallindrome sequence is: "+ p);
    }
}