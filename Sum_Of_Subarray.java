import java.util.Scanner;

public class Sum_Of_Subarray {
    public static void sumofSubArrays(int Array[]) {
        // int totalSubarray = 0;
        int sum = 0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < Array.length; i++) {
            for (int j = i; j < Array.length; j++) {

                for (int k = i; k <= j; k++) {
                    // System.out.print(" " + Array[k] + " ");
                    sum = sum + Array[k];

                }
                // totalSubarray++;
                if (sum > max) {
                    max = sum;
                }

                System.out.println(" --->>Sum of these Subarray = " + sum);
                sum = 0;
            }

            System.out.println();
        }
        System.out.println("Maximum sum = " + max);
        // System.out.println("Total Subarray = " + totalSubarray);
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

        sumofSubArrays(Array);

        sc.close();
    }
}
