import java.util.Scanner;

public class Subarrays {
    public static void SubArrays(int Array[]) {
        int totalSubarray = 0;
        for (int i = 0; i < Array.length; i++) {

            for (int j = i; j < Array.length; j++) {
                System.out.print("[");

                for (int k = i; k <= j; k++) {
                    System.out.print(" " + Array[k] + " ");
                }
                totalSubarray++;

                System.out.print("]");

            }
            System.out.println();
        }
        System.out.println("Total Subarray = " + totalSubarray);
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

        SubArrays(Array);

        sc.close();
    }
}
