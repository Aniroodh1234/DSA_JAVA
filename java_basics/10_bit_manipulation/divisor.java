public class divisor{
    public static void main(String[]args){
        int n = 12;
        int count = 0;
        for(int i = 1; i<Math.sqrt(n);i++){
            if(n%i==0){
                if(i==n/i){  // handling the perfect square condition
                    count++;
                }
                else{  // normal condition 
                    count = count +2;
                }
            }
        }
        System.out.print(count);
    }
}

    