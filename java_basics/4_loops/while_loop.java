import java.util.*;

public class while_loop{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //print number from 1 to the number given by user
        // System.out.print("Enter a number: ");
        // int a = sc.nextInt();
        // int i = 1;
        // while(i <= a){
        //     System.out.print(i +" ");
        //     i++;
        // }

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= a){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to " + a + " is: " + sum);
    }
}