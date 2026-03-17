import java.util.*;
public class update_i_term{
    public static void update(int n, int i){
        int bitmask_set = 1<<i;
        int n_new_set = (n | bitmask_set);
        System.out.println("value after setting: "+n_new_set);

        int bitmask_clear = ~(1<<i);
        int n_new_clear = (n & bitmask_clear);
        System.out.println("value after clearning: "+n_new_clear);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int position = sc.nextInt();
        update(n,position);
    }
}