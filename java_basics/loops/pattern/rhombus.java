//     *****
//    *****
//   *****
//  *****
// *****

import java.util.*;
public class rhombus{
    public static void pattern(int x){
        // for(int i = 1; i<=x;i++){
        //     // space print
        //     for(int j = 1; j <= (x-i); j++){
        //         System.out.print(" ");
        //     }
        //     // star print
        //     for(int j = x; j <= (2*x-1); j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i =1; i<=x;i++){
            // space print
            for(int j = 1; j <= (x-i); j++){
                System.out.print(" ");
        
            }
            for(int j=1; j<=x;j++){
                System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print rhombus: ");
        int n = sc.nextInt();
        pattern(n);    
    }
}