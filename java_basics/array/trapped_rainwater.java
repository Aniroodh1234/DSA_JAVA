public class trapped_rainwater{
    public static int trappedwater(int arr[]){

        //cal the left max bar
        int max_left[] = new int[arr.length];
        max_left[0] = arr[0]; 
        for(int i = 1; i<arr.length;i++){
            max_left[i] = Math.max(arr[i],max_left[i-1]);
        }

        // cal the right max bar
        int max_right[] = new int[arr.length];
        max_right[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i>=0; i--){
            max_right[i] = Math.max(arr[i],max_right[i+1]);
        }

        int trapped_water =  0;
        int width = 1;

        for(int i = 0; i<arr.length; i++){
            
            // cal the height of water = min(left max bar, right max bar)
            int water_height = Math.min(max_right[i], max_left[i]);

            // cal total water trapped = (height of water - height of bar) + width of bar
            trapped_water = trapped_water + (water_height - arr[i])*width;
        }

        return trapped_water;
    }

    public static void main(String[]args){
        int height[] = {4,2,0,6,3,2,5};
        int holdwater = trappedwater(height);
        System.out.print("The total water hold in all the bar heights is: "+holdwater);
    }
}