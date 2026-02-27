// * * * *
// *     *
// * * * *


import java.util.*;
public class hollow_rectangle{
    public static void pattern(int x, int y){
        for(int i = 1; i<=x;i++){
            for(int j = 1; j<=y; j++){
                if(i==1 || i==x || j ==1|| j==y){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows to print: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of rows to print: ");
        int t = sc.nextInt();
        pattern(n,t);

    }
}