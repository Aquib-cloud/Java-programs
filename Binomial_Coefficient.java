import java.util.Scanner;

public class Binomial_Coefficient {

    public static int factorial(int n) {

        int Factorial = 1;

        for (int i = 1; i <= n; i++) {
            Factorial *= i;
        }

        return Factorial;

    }

    // Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("Enter the value of r: ");
        int r = input.nextInt();

        int Binomial_Coefficient = factorial(n) / (factorial(r) * factorial(n - r));  //    n!/(r!(n-1)!)

        System.out.println("Binomial Coefficient = " + Binomial_Coefficient);

        input.close();
    }
}
