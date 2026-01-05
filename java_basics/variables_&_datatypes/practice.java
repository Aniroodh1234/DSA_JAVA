// In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers.

// import java.util.*;
// public class practice{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number (A): ");
//         float x = sc.nextFloat();
//         System.out.print("Enter the second number (B): ");
//         float y = sc.nextFloat();
//         System.out.print("Enter the third number (C): ");
//         float z = sc.nextFloat();

//         float average = (x + y + z) / 3;
//         System.out.println("The average of the three numbers is: " + average);
//     }
// }


// In a program, input the side of a square. You have to output the area of the square.
// import java.util.*;
// public class practice{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the side of the square: ");
//         float side = sc.nextFloat();
//         float area = side * side;
//         System.out.println("The area of the square is: " + area);   
//     }

// }


//Enter cost of 3 items from the user (using float datatype) - a pencil, a pen and an eraser. You have to output the total cost
//  of the items back to the user as their bill.
import java.util.*;
public class practice{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of the pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("\nEnter the cost of the pen: ");
        float pen = sc.nextFloat();
        System.out.print("\nEnter the cost of the eraser: ");
        float eraser = sc.nextFloat();
        float totalCost = pencil + pen + eraser;
        System.out.print("\nThe total cost of the items is: " + totalCost);
    }

}