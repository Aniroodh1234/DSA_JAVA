import java.util.*;
public class range_prime{
    public static void primerange(int n ){
        if(n ==1){
            System.out.print("There are no prime numbers in this range");
        }
        if(n==2){
            System.out.print("2 is a prime number");
        }
        for (int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print("The prime numbers in the range of 1 to " + n + " are: ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to calculate the prime number: ");
        int n = sc.nextInt();

        System.out.print("The prime numbers in the range of 1 to " + n + " are: ");
        primerange(n);
    }
}