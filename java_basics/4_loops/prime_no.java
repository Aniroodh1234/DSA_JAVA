import java.util.Scanner;
public class prime_no{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check for the prime number: ");
        int n = sc.nextInt();
        if(n == 1){
            System.out.print("1 is neither prime nor composite number.");
        }
        boolean is_prime = true;
        for(int i =2; i<= Math.sqrt(n);i++){
            if(n%i==0){
                is_prime = false;
            }
        }
        if(is_prime == true){
            System.out.print("" + n + " is a prime number.");
        }
        else{
            System.out.print("" + n + " is not a prime number.");
        }
    }
}