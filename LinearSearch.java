import java.util.Scanner;


public class LinearSearch {

    public static int linearSearch(int Dictionary[], int key) {
        for (int i = 0; i <= Dictionary.length; i++) {
            if (Dictionary[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Dictionary[] = { 1, 3, 2, 5, 7, 9, 6, 4, 84, 10, 21, 14, 24 };

        System.out.println("Enter the Key: ");
        int key = input.nextInt();

        int indexLocation = linearSearch(Dictionary, key);
        if (indexLocation == 0) {
            System.out.println("Key Not Found.");
        } else {
            System.out.println(indexLocation + " is the index location of the key.");
        }

        input.close();
    }
}