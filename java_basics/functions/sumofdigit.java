import java.util.*;
public class sumofdigit{
    public static int sum(int x){
        int add = 0;

        while(x!=0){
            int digit = x%10;
            add = add +digit;
            x = x/10;
        }
        return add;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int s = sum(n);
        System.out.print("The sum of "+ n +" is "+ s);

    }
}