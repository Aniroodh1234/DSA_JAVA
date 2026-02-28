import java.util.*;
public class binarytodecimal {
    public static int convert(int binnum) {
        int pow = 0;
        int dec = 0;
        while(binnum>0){
            int digit = binnum%10;
            dec = dec + digit * (int)Math.pow(2, pow);
            pow++;
            binnum = binnum/10;
        }
        return dec;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        int decimal = convert(n);
        System.out.println("Decimal equivalent: " + decimal);
    }
}
