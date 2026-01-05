import java.util.*;

public class user_input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println("You entered: " + a);
        // float b = sc.nextFloat();
        // // System.out.println("You entered: " + b);
        // // String word = sc.next();
        // // System.out.println("You entered: " + word);
        // String sent = sc.nextLine();
        // System.out.println("You entered: " + sent);
        // double d = sc.nextDouble();
        // System.out.println("You entered: " + d);
        // long l = sc.nextLong();
        // System.out.println("You entered: " + l);
        // char c = sc.next().charAt(0);
        // System.out.println("You entered: " + c);


        // Taking input from user and perform sum
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        // Taking input from user and perform product
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int product = n1 * n2;
        System.out.println("The product is: " + product);

        // Find area of circle
        System.out.print("Enter radius of circle: ");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("The area of the circle is: " + area);

    }
}

