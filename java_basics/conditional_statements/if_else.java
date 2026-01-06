import java.util.Scanner;

public class if_else{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // Print greates of two numbers
        // System.out.print("Enter the first number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter the second number: ");
        // int b = sc.nextInt();
        // if (a >= b){
        //     System.out.println(a+" is greater than or equal to "+b);
        // }
        // else{
        //     System.out.println(b+" is greater than "+a);
        // }

        // print the numebr is odd or even
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a % 2 ==0){
            System.out.println(a+" is even");
        }
        else{
            System.out.println(a+" is odd");
        }
    }
}