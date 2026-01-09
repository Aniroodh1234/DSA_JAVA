import java.util.*;
public class invert_star{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you need to print the pattern: ");
        int n = sc.nextInt();
        // for(int i = 1;i <= n;i++){
        //     for(int j = n; j >= i;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println(); 
        }

    }
}