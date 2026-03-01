public class array_pairs{
    public static void pairs(int arr[]){
        int tp = 0;
        for(int i = 0; i<arr.length;i++){
            int p = arr[i];
            for(int j = i+1; j<arr.length; j++){
                System.out.print("("+p+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total array pairs are: "+tp);
    }
    public static void main(String[]args){
        int number[] = {2,4,6,8,10};
        pairs(number);
    }
}