public class stringarray{
    public static void main(String[]args){
        String name [] = {"flower","mango","apple"};
        int num[] = {1,2,3,4,5,6};
        char ch[] = {'a','b','c','d'};

        // print every string elements
        for(int i = 0; i<name.length;i++){
            for(int j = 0; j<name[i].length();j++){
                System.out.print(name[i].charAt(j)+" ");
            }
            System.out.println();
        }

        // print character array
        for(int i = 0; i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }

        System.out.println();
        
        // print the number array
        for(int i = 0; i< num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}