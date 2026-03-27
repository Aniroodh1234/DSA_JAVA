// code to print the nth term of a fibonacii series
import java.util.*;
public class fibonacii{

    public static int fibonacii(int n){
        // f(n) = f(n-1) + f(n-2) --> logic behind fibonacii
        if(n==0||n==1){
            return 1;
        }
        int nm1 = fibonacii(n-1);
        int nm2 = fibonacii(n-2);
        int result = nm1 + nm2;
        return result;

}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int result = fibonacii(n);
        System.out.print(result);
        }
    }
