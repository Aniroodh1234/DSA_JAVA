import java.util.*;
public class factorial{

    public static int factorial_no(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
        
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate the factorial: ");
        int n = sc.nextInt();
        int fact = factorial_no(n);
        System.out.print("The factorial of "+ n + " is: "+fact);
        sc.close();
    }
}