import java.util.*;

public class array_basics {

    //array call by reference function 
    public static void add(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating array
        int arr[] = new int[3];

        // taking aaray inputs
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        //printing array element
        System.out.println("printing the zero element of array " + arr[0]);

        System.out.print("value of array before the function call ");
        // printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // array function
        add(arr);

        // printing array
        System.out.print("value of array after the function call ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
