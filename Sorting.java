
import java.util.Scanner;

public class Sorting {

    public static int input() {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        return x;
    }

    public static int[] CreateArray() {
        System.out.print("Enter size of array: ");
        int n = input();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Value at index " + i + " = ");
            array[i] = input();
        }
        return array;
    }

    // This is Bubble Sort
    public static int[] BubbleSort(int array[], int n) {
        int temp;
        boolean swap = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                System.out.println("Already Sorted....");
                break;
            }
        }
        return array;
    }

    // This is Selection Sort
    public static int[] SelectionSort(int array[], int n) {
        int temp, positionOfMinimumValue;
        boolean swap = false;

        for (int i = 0; i < n - 1; i++) {
            positionOfMinimumValue = i;
            swap = false;
            for (int j = i + 1; j < n; j++) {
                if (array[positionOfMinimumValue] > array[j]) {
                    positionOfMinimumValue = j;
                    swap = true;
                }
            }    
            // swap 
                temp = array[positionOfMinimumValue];
                array[positionOfMinimumValue] = array[i];
                array[i] = temp;
            
            if (!swap) {
                System.out.println("Already Sorted....");
                break;
            }
        }
        return array;
    }

    // This is Insertion Sort
    public static int[] InsertionSort(int array[], int n) {

        int current, previous;
        boolean indicator = false;

        for (int i = 1; i < n - 1; i++) {
            current = array[i];
            previous = i - 1;
            //  For correct position
            for (; array[previous] > current && previous >= 0; previous--) {
                array[previous + 1] = array[previous];
                indicator = true;
            }
            if(!indicator){
                System.out.println("Already Sorted.....");
                break;
            }
            // Insertion
            array[previous + 1] = current;
        }
        return array;
    }

    public static void main(String args[]) {

        // Bubble Sort 
        {
            int array[] = CreateArray();
            System.out.println("\n\nBy Using Bubble Sort: ");
            BubbleSort(array, array.length);
            for (int i = 0; i < array.length; i++) {
                System.out.println("i" + i + " = " + array[i]);
            }
        }

        System.out.println("\n\n\n");

        // Selection Sort
        {
            int array2[] = CreateArray();
            System.out.println("\n\nBy Using Selection Sort: ");
            SelectionSort(array2, array2.length);
            for (int i = 0; i < array2.length; i++) {
                System.out.println("i" + i + " = " + array2[i]);
            }
        }

        System.out.println("\n\n\n");

        // Insertion Sort
        {
            int array3[] = CreateArray();
            System.out.println("\n\nBy Using Insertion Sort: ");
            SelectionSort(array3, array3.length);
            for (int i = 0; i < array3.length; i++) {
                System.out.println("i" + i + " = " + array3[i]);
            }
        }
    }
}