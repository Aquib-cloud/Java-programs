import java.util.Scanner;

//Time Complexity = log (n)

public class Binary_Search {

    public static int BinarySearch(int Array[], int key) {

        int start = 0;
        int end = Array.length - 1;

        for (; start <= end;) {
            int mid = (start + end) / 2;

            if (Array[mid] == key) {
                return mid;
            }
            if (Array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();
        int Array[] = new int[n];

        System.out.print("Enter Elements in Ascending order: ");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }

        System.out.print("Enter Key : ");
        int key = sc.nextInt();

        int index = BinarySearch(Array, key);

        if (index == -1) {
            System.err.println("Key not found");

        } else {
            System.out.println("Key is located at index : " + index);
        }

        sc.close();
    }
}
