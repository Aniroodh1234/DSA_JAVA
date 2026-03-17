import java.util.*;
public class set_i_term{
    public static void set(int n, int i){
        int bitmask = 1<<i;
        int n_new = (n | bitmask);
        System.out.print(n_new);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int position = sc.nextInt();
        set(n,position);
    }
}