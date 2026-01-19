import java.util.*;
public class Linear_Search{

    // function to check whether the number is in array or not
    public static int Search(int arr[], int n){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // input array
        System.out.print("Enter the array elements to find the largest: ");
        int number[] = new int[5];
        number[0] = sc.nextInt();
        number[1] = sc.nextInt();
        number[2] = sc.nextInt();
        number[3] = sc.nextInt();
        number[4] = sc.nextInt();

        // printing the array elements
        System.out.print("\nNumber array: ");

        for(int i =0; i<number.length;i++){
            System.out.print(number[i]+" ");
        }

        // check number if exist in array or not
        System.out.print("\nEnter a number to check whether it exist in array or not: ");
        int m = sc.nextInt();

        // print the element index
        int index = Search(number,m);
        if(index!= -1){
            System.out.print("The element is at: "+index);
        }
        else{
            System.out.print("not found");
        }
    }
}