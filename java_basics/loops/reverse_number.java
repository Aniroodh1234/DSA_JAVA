import java.util.*;
public class reverse_number {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        // reverse a number using string --> 03042004 --> 40024030
        // System.out.print("Enter a number: ");
        // String num = sc.nextLine();
        // for(int i = num.length()-1; i >= 0; i --){
        //     System.out.print(num.charAt(i));
        // }

        // reverse a number using while loop
        System.out.print("Number: ");
        int n = sc.nextInt();
        while(n > 0){
            int digit  = n % 10;
            System.out.print(digit);
            n = n / 10;
        }
    }
}

