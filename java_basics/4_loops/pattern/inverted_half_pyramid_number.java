// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

import java.util.*;
public class inverted_half_pyramid_number{
    public static void pattern(int x){
        for(int i = 1; i <= x; i++){
            for(int j = 1; j<=x-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        pattern(n);
    }
}