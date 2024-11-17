import java.util.Scanner;

public class Function_Overloading {

    // Integer
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    // Float
    public static float Sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two Number: ");

        System.out.println("Sum = " + Sum(input.nextInt(), input.nextInt()));
        input.close();

    }
}
