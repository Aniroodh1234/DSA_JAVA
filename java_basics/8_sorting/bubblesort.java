//inplace sorting algorithm --> no extra space used and all the sorting is inside the array

public class bubblesort{
    public static void bubblesort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){  // cal the turn 
            boolean swapped = false;
            for(int j = 0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];  
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void printarray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[]args){
        int number [] = {1,2,3,4,5,6,7};
        bubblesort(number);
        printarray(number);
    }
}