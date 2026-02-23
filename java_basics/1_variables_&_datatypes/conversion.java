import java.util.*;

public class conversion{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // performing type conversions --> here one type of data is converted to another type of data --> implicit conversion

        int a = sc.nextInt();
        long b = a;  
        System.err.println("The long value is: " + b); 

        // performing type casting --> explicit conversions
        float c = 6.456f;
        int d = (int) c;
        System.out.println("The int value is: " + d);

        //performing type promotions

        // in type promotions -- char, short, byte converted into int
        // if any of the vartibale is long, double or float then the whole expression will be converted into that one

        byte x = 1;
        short y = 9;
        int z = 73;
        char d2 = 'a';
        System.out.print("x + y + z + d2 = ");
        System.out.println(x + y + z + d2); // here all the variables are promoted

        float f = 6.67f;
        long l = 564574567;
        double p = 563.43632;
        System.out.print("f + l + p = " );
        System.out.println(f + l + p);  
    }
}