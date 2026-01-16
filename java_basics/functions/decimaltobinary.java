import java.util.*;
public class decimaltobinary{
    public static int converter(int x){
        int pow = 0;
        int num = 0;
        while(x>0){
            int rem = x%2;
            num = num + rem*(int)Math.pow(10,pow);
            pow++;
            x = x/2;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to convert it to binary: ");
        int n = sc.nextInt();
        int binary = converter(n);
        System.out.print("The binary value of "+n +" is "+binary);
    }
}