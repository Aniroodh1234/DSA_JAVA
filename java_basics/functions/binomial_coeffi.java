import java.util.*;
public class binomial_coeffi{
    public static int factorial_no(int x){
        int fact = 1;
        for(int i = 1; i<=x; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to calculate nCr: ");
        int n = sc.nextInt();
        System.out.print("Enter r to calculate nCr: ");
        int r = sc.nextInt();
        int binomial = factorial_no(n)/(factorial_no(r)*factorial_no(n-r));
        System.out.print("The value of "+ n + "C" + r + " is: " + binomial);
    }
}