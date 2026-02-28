public class function_overloading{
    public static int add(int a, int b){
        return a + b;
    }

    public static float add(float a, float b, float c){
        return a + b + c;
    }
    public static void main(String[]args){
        System.out.println(add(3,3));
        System.out.println(add(2.5f,3.5f,4.0f));

    }
}