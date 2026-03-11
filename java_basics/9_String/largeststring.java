// here we need to print the largest array on the basis of lexicographic manner --> it means the word which comes later in 
// the alphabatical order is the largest one, like mango > banana > apple

public class largeststring{
    public static void main(String[] args) {
        String fruits[] = {"Apple","banana","mango"};

        String largest = fruits[0];
        for(int i = 0; i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.print(largest);
    }
}
