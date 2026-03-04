// diagonal sum is only done in n*n matrix
import java.util.*;
public class diagonal_sum{
    public static void diagonalsum(int arr[][]){
        int t_sum = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                if(i==j || (i+j)==arr.length-1){
                    t_sum = t_sum+arr[i][j];

                }
                if((i==j) && (i+j)==arr.length-1){
                    t_sum = t_sum-arr[i][j];
                }
            }
        }
        System.out.print("Diagonal_sum: "+t_sum);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];

        // take matrix input
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        diagonalsum(matrix);
    }
}