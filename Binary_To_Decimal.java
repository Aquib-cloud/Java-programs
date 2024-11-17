import java.util.Scanner;

public class Binary_To_Decimal {

    public static int BinaryToDecimal(int binaryNum) {
        int pow = 0;
        int decimalNum = 0;
        while (binaryNum > 0) {
            int LastDigit = binaryNum % 10;
            decimalNum = decimalNum + (LastDigit * (int) Math.pow(2, pow));
            pow++;
            binaryNum /= 10;
        }
        return decimalNum;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Binary Number : ");
        int binaryNum = input.nextInt();

        int Decimal = BinaryToDecimal(binaryNum);
        System.out.println("Decimal of " + binaryNum + " = " + Decimal);

        input.close();
    }
}
