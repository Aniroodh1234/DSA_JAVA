import java.util.*;

public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        System.out.println("Select operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");  

        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Result: " + (num1 + num2));
        }
        else if(choice == 2){
            System.out.println("Result: " + (num1 - num2));
        }
        else if(choice == 3){
            System.out.println("Result: " + (num1 * num2));
        }
        else if(choice == 4){
            if(num2 != 0){
                System.out.println("Result: " + (num1 / num2));
            }
            else{
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
        else{
            System.out.println("Invalid choice!");
        }
    }
}