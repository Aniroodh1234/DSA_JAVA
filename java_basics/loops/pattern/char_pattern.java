// A
// B C
// D E F
// G H I J
// K L M N O 

import java.util.*;
public class char_pattern{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print character pattern: ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 1; i<= n; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(ch);  
                ch++;
            }
            System.out.println();
        }
    }
}