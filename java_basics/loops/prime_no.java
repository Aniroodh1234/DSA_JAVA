import java.util.*;
public class prime_no{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("1 is neither prime nor composite number.");
            return;
        }
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i ==0){
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}