public class reverse_array{
    public static void reverse(int arr[]){
        System.out.print("\nReverse of the array: ");
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        System.out.print("Original array: ");
        int number[] = {2,4,6,8,10};

        // print the array
        for(int i =0; i<number.length;i++){
            System.out.print(number[i]+" ");
        }

        // reverse array
        reverse(number);
    }
}