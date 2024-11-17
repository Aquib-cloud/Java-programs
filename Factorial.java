
import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Number: ");
        int n = input.nextInt();
        int fac = 1;

        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                fac *= i;
            }
            System.out.println("Factorial of " + n + " = " + fac);
        } else {
            System.out.println("Factorial for negative number is not defined");
        }
        input.close();
    }

}
