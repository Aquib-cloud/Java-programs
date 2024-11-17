import java.util.Scanner;

public class Pairs_Of_Array {
    public static void Pairs(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            // int current = Array[i];
            for (int j = i + 1; j < Array.length; j++) {
                System.out.print("( " + Array[i] + ", " + Array[j] + " )");

            }
            System.out.println();
        }
        int TP = (Array.length * Array.length) / 2;
        System.out.println("Total Number of Pairs = " + TP);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();
        int Array[] = new int[n];

        System.out.print("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            Array[i] = sc.nextInt();
        }

        Pairs(Array);

        sc.close();
    }

}
