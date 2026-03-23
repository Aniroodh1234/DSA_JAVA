// pirnt number from 1 to 10 in decreasing order

// public class basics{
//     public static void print(int n){
//         // base case define
//         if(n==1){
//             System.out.print(n+" ");
//             return;
//         }
//         System.out.print(n+" ");
//         print(n-1);
//     }
//     public static void main(String[]args){
//         print(10);
//     }
// }


// print numbers in increasing order
public class basics{
    public static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[]args){
        print(10);
    }
}
