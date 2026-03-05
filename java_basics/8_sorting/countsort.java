public class countsort{
    public static void sort(int arr[]){
        
        // find the maximum element
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        // create the frequency count array
        int count[] = new int[max+1];
        for(int i =0; i<arr.length;i++){
            count[arr[i]]++;
        }
        // perfrom sorting
        int j = 0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[]args){
        int number[] = {1,4,1,3,2,4,3,7};
        sort(number);

        // print the array
        for(int i =0; i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}