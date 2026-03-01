public class binary_search{
    public static int search(int arr[], int key){
        int start = 0; 
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int number[] = {10,34,56,67,78,99};
        int key = 78;
        System.out.print("The index of the number in the array is: "+search(number,key));
    }
}