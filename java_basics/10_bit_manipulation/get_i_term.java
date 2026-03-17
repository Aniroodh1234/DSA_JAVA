import java.util.*;
public class get_i_term{
    public static void get(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            System.out.print(0);
        }
        else{
            System.out.print(1);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int position = sc.nextInt();
        get(n,position);
    }
}