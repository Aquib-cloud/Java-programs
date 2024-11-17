import java.util.Scanner;

public class MaxSubArray {

    public static void MaxsumofSubArrays(int Array[]) {
        int sum = 0;

        int max = Integer.MIN_VALUE;

        int prefix[] = new int[Array.length];

        prefix[0] = Array[0];

        // To create prefix Array (sum of previous values)

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + Array[i];
        }
        for (int i = 0; i < Array.length; i++) {
            for (int j = i; j < Array.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (sum > max) {
                    max = sum;
                }

                System.out.println(" --->>Sum of these Subarray = " + sum);
                sum = 0;
            }

            System.out.println();
        }
        System.out.println("Maximum sum = " + max);
    }

    // KADAN's Method

    public static void KadansMethod(int Array[]) {
        int Maximum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        for (int i = 0; i < Array.length; i++) {
            CurrentSum += Array[i];
            if (CurrentSum < 0) {
                CurrentSum = 0;
            }
            Maximum = Math.max(CurrentSum, Maximum);
        }

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

        KadansMethod(Array);
        MaxsumofSubArrays(Array);

        sc.close();
    }
}