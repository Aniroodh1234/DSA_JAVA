import java.util.*;

public class income_tax_cal{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income amount: ");
        double income = sc.nextDouble();
        if(income < 500000){
            System.out.println("No tax");
        }
        else if(income >= 500000 && income <1000000){
            double net_income = income - (income * 0.2);
            System.out.println("Net income after tax: " + net_income);
        }
        else if(income > 1000000){
            double net_income = income - (income * 0.3);
            System.out.println("Net income after tax: " + net_income);
        }
    }
}