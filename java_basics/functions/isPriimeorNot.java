import java.util.*;
public class isPriimeorNot{
    public static boolean prime(int n){
        if(n==1){
            System.out.print(n + " is neither prime nor composite");
        }
        boolean is_prime = true;
        for(int i = 2; i<= Math.sqrt(n);i++){
            if(n%i==0){
                is_prime = false;
                return is_prime;

            }
        }
        return is_prime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if its prime or not: ");
        int n = sc.nextInt();
        boolean x = prime(n);
        System.out.print("The number " + n + " is prime: " + x);
    }
}