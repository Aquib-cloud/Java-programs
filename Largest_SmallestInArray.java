import java.util.Scanner;

public class Largest_SmallestInArray {
    public static int LargestElement(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -Infinity
        int smallest = Integer.MAX_VALUE; // +Infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println(smallest + " is the Smallest number in the Array.");
        return largest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of Array.");
        int n = sc.nextInt();

        int numbers[] = new int[n];
        System.out.print("Enter Elements of Array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(LargestElement(numbers) + " is the largest element in the Array.");

        sc.close();
    }

}
