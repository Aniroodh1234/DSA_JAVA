public class largest_array{
    public static int large(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[]args){
        int number[] = {23,54,66,78,2};
        System.out.print("The largest number in the array is: "+large(number));
    }
}