public class insertionsort{

    public static void sort(int arr[]){
        for(int i = 1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // here we check the correct index to insert the number
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // here we insert the number    
            arr[prev+1] = curr;
        }
    }
    public static void main(String[]args){
        int number[] = {5,4,1,3,2};
        sort(number);

        // print the array
        for(int i = 0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}