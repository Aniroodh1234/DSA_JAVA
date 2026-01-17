// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *


import java.util.*;
public class Butterfly{
    public static void pattern(int x){
        // 1st half
        for(int i =1; i <= x; i++){
            // star print
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            //space print
            for(int j = 1; j <= 2*(x-i);j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i = x; i>=1; i--){
            // star print
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            //space print
            for(int j = 1; j <= 2*(x-i);j++){
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
        System.out.print("Enter the number to print butterfly: ");
        int n = sc.nextInt();
        pattern(n);
    }
}