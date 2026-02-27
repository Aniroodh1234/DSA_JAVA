import java.util.*;
public class hollow_rhombus{
    public static void pattern(int x){
        for(int i =1; i<=x;i++){
            //space print
            for(int j = 1; j<=x-i;j++){
                System.out.print(" ");
            }
            // hollow rectangle print
            for(int j = 1; j<=x;j++){
                if(i==1 || i==x || j==1 || j==x){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to print hollow rhombus: ");
        int n = sc.nextInt();
        pattern(n);        
    }
}