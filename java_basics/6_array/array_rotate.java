// anti clockwise rotation
public class array_rotate{
    public static void rotate(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

// clockwise rotation

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int  k = 2;
        k = k%n;

        // anti cloclkwise/ left rotation
        // rotate(arr,0,k-1);  // first k element
        // rotate(arr,k,n-1);  // then n-k element
        // rotate(arr,0,n-1);  // reverse complete array

        // clockwise rotation/ right rotation
        rotate(arr,0,n-1);     // reverse the complete array
        rotate(arr,0,k-1);     // reverse the first k element
        rotate(arr,k,n-1);     // reverse the next k element
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}