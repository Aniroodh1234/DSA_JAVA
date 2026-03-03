public class Maxsubarray_sum{
    public static void subarray(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j<=arr.length;j++){
                int end = j;
                for(int k = start; k<end;k++){
                    // System.out.print(arr[k]+" ");
                    currsum = currsum + arr[k];
                }
                System.out.println("Subarray sum: "+currsum);

                if(currsum>maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.print("Max sum is: "+maxsum);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        subarray(number);
    }
}