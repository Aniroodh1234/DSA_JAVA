public class first_occurance{
    public static int find_first(int arr[], int n, int  i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return find_first(arr,n,i+1);
    }

    public static int find_last(int arr[], int n, int i){
        if(i==arr.length){
            return -1;
        }
        int last = find_last(arr,n,i+1);
        if(arr[i]==n && last==-1){
            return i;
        }
        return last;
    }
    public static void main(String[]args){
        int arr[] = {1,2,3,4,7,2,4,4,4,7,6,8};
        int num = 7;
        int pos = 0;
        // System.out.print(find_first(arr,num,pos));
        int last = find_last(arr,num,pos);
        System.out.print(last);

    }
}