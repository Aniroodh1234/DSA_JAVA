public class Kadane_algo{
    public static void kadane_p(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            currsum = currsum + arr[i];
            if(currsum<0){
                currsum = 0;
            }
            maxsum = Math.max(currsum,maxsum);
        }
        System.out.print("The maxsubarray sum is: "+maxsum);
    }

    public static void kadane_n(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            currsum = currsum +arr[i];
            maxsum = Math.max(currsum,maxsum);
            
            if(currsum<0){
                currsum = 0;
            }
        }
        System.out.print("\nThe maxsubarray sum is: "+maxsum);
    }
    public static void main(String[]args){
        int number_positive[] = {2,4,5,-5,8,0};
        int number_negative[] = {-3,-4,-1,-6,-3};
        kadane_p(number_positive);
        kadane_n(number_negative);
    }
}