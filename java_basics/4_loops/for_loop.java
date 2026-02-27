// print a aquare pattern using for loop

import java.util.*;
public class for_loop{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Square Pattern: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}