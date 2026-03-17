import java.util.*;
public class odd_even{
    public static void even_or_odd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.print("even number");
        }
        else{
            System.out.print("Odd number");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        even_or_odd(n);
    }
}