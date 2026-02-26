import java.util.*;
public class diamond{
    public static void pattern(int x){
        // 1st part
        for(int i =1; i<=x;i++){
            //space print
            for(int j = 1; j<=x-i;j++){
                System.out.print(" ");
            }
            //star print
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =x;i>=1;i--){
            //space print
            for(int j = 1; j<=x-i;j++){
                System.out.print(" ");
            }
            //star print
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print the diamond: ");
        int n = sc.nextInt();
        pattern(n);    
    }
}