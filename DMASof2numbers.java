import java.util.Scanner;

public class DMASof2numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Value of a = ");
        int a = sc.nextInt();
        System.out.print("\nValue of b = ");
        int b = sc.nextInt();
        System.out.print("\noperation: ");
        String operation = sc.next();

        switch (operation) {
            case "/":
                if (b <= a) {
                    System.out.println(a / b);
                } else {
                    System.out.println("'b' must be greater than 'a' for this operation");
                }
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "%":
                if (b <= a) {
                    System.out.println(a % b);
                } else {
                    System.out.println("'b' must be greater than 'a' for this operation");
                }
                break;
            default:
                System.out.println(
                        "\nOnly Divide, Multiply, Addition, Subtraction and Remainder are available.\n\nUse: / for division.\n     * for multiplication.\n     + for addition.\n     - for subtraction.\n     % for remainder");
        }
    }
}