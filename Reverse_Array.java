import java.util.Scanner;

public class Reverse_Array {

    public static void ReverseArray(int Array[]) {
        int Start = 0, End = Array.length - 1;

        while (Start < End) {
            int temp = Array[Start];
            Array[Start] = Array[End];
            Array[End] = temp;
            Start++;
            End--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();

        int Array[] = new int[n];

        System.out.print("Enter Elements of Array: ");
        for (int i = 0; i < n; i++) {
            Array[i] = sc.nextInt();
        }

        ReverseArray(Array);
        System.out.print("Reverse Of Array = ");
        for (int i = 0; i < n; i++) {

            System.out.print(Array[i] + " ");
        }

        sc.close();
    }
}