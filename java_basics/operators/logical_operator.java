public class logical_operator{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Logical AND operator
        System.out.println((a < b) && (a != b)); // true && true = true
        System.out.println((a < b) && (a == b)); // true && false = false   

        // Logical OR operator
        System.out.println((a < b) || (a == b)); // true || false = true
        System.out.println((a > b) || (a == b)); // false || false = false

    }
}