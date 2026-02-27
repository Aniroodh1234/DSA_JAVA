//         *
//       * *
//     * * *
//   * * * *
// * * * * *

import java.util.*;
public class inverted_rotated_pyramid{
    public static void pattern(int x){
        for(int i = 1; i<=x; i++){
            for(int j = 1; j<= x-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        pattern(n);
    }
}