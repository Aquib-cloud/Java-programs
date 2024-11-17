import java.util.Scanner;

public class Decimal_To_Binary {

    public static int DecimalToBinary(int n) {

        int pow = 0;
        int BinaryNum = 0;

        while (n > 0) {
            int remainder = n % 2;

            BinaryNum = BinaryNum + (remainder * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        return BinaryNum;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        int Decimal = input.nextInt();

        System.out.print("Binary of Decimal " + Decimal + " = " + DecimalToBinary(Decimal));

        input.close();
    }
}