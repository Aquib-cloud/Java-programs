
import java.util.Scanner;

public class Patterns {

    public static void RightHalfPyramid() {

        /*
                *
                **
                ***
                ****          
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }

    public static void LeftHalfPyramid() {

        /*
               *
              **
             ***
            ****
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }

    public static void Pyramid() {

        /*
               *
              ***
             *****
            *******
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }

    public static void upsidedownRightHalfPyramid() {

        /*
            **** 
            ***
            **
            *
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }

    public static void upsidedownLeftHalfPyramid() {
        /*
            *****
             ****
              ***  
               **
                * 
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");

            }
            for (int k = n; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }

    public static void upsidedownPyramid() {
        /*
        *********
         *******
          *****
           ***
            *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }

    public static void HollowSquare() {
        /*
         ****
         * *
         * *
         ****
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side of Square: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();

    }

    public static void FloydsTriangle() {
        /*
         * 1
         * 23
         * 456
         * 78910
         * 1112131415
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int n = input.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        input.close();

    }

    public static void Triangle01() {
        /*
         * 1
         * 01
         * 101
         * 0101
         * 10101
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Rows: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

        input.close();

    }

    public static void Butterfly() {

        /*
         * *
         * * * *
         * * * * * *
         * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * *
         * * * * * *
         * * * *
         * *
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Lines: ");
        int n = input.nextInt();
        // 1st Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd Half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }

    public static void Rhombus() {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        input.close();
    }

    public static void HollowRhombus() {
        /*
         * * * * *
         * *
         * *
         * *
         * * * * *
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                if (k == 1 || k == n || i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.err.print("  ");
                }
            }
            System.out.println();
        }

        input.close();
    }

    public static void Diamond() {
        /*
         *
         * * *
         * * * * *
         * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * *
         * * * * *
         * * *
         * 
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();

    }

    public static void NumberPyramid() {
        /*
         * 1
         * 2 2 2
         * 3 3 3 3 3
         * 4 4 4 4 4 4 4
         * 5 5 5 5 5 5 5 5 5
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        input.close();
    }

    public static void Palindrome() {
        /*
         * 1
         * 2 1 2
         * 3 2 1 2 3
         * 4 3 2 1 2 3 4
         * 5 4 3 2 1 2 3 4 5
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
        input.close();
    }

//      *          *          *          *          *          *          *          *          *          *
//     * *        * *        * *        * *        * *        * *        * *        * *        * *        * *
//    *   *      *   *      *   *      *   *      *   *      *   *      *   *      *   *      *   *      *   *   
//   *     *    *     *    *     *    *     *    *     *    *     *    *     *    *     *    *     *    *     *
//  *       *  *       *  *       *  *       *  *       *  *       *  *       *  *       *  *       *  *       * 
    public static void Mountain() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Mountains: ");
        int num = sc.nextInt();
        for (int i = 0; i < r; i++) {

            for (int l = 1; l <= num; l++) {

                for (int k = r; k >= i + 1; k--) {
                    if (k > i + 1) {
                        if (k == r) {
                            System.out.print(" ");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print("*");
                    }
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print(" ");
                    if (j == i * 2 - 1) {
                        System.out.print("*");
                    }
                }
                for (int m = r; m > i + 1; m--) {
                    if (m == r) {
                        System.out.print(" ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    // Main Method
    public static void main(String args[]) {
        System.out.println("\n\n\t\tAvailable Patterns:\n\n");
        System.out.println("1. Right Half Pyramid.");
        System.out.println("2. Left Half Pyramid.");
        System.out.println("3. Pyramid.");
        System.out.println("4. upsidedown Right Half Pyramid.");
        System.out.println("5. upsidedown Left Half Pyramid.");
        System.out.println("6. upsidedown Pyramid.");
        System.out.println("7. Hollow Square.");
        System.out.println("8. Floyd's Triangle.");
        System.out.println("9. 0-1 Triangle.");
        System.out.println("10. Butterfly.");
        System.out.println("11. Rhombus.");
        System.out.println("12. Hollow Rhombus.");
        System.out.println("13. Diamond.");
        System.out.println("14. Number Pyramid.");
        System.out.println("15. Palindromic Pattern.");
        System.out.println("16. Mountain Pattern.");

        System.out.print("\n\n\t\tEnter Number : ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                RightHalfPyramid();
                break;
            case 2:
                LeftHalfPyramid();
                break;
            case 3:
                Pyramid();
                break;
            case 4:
                upsidedownRightHalfPyramid();
                break;
            case 5:
                upsidedownLeftHalfPyramid();
                break;
            case 6:
                upsidedownPyramid();
                break;
            case 7:
                HollowSquare();
                break;
            case 8:
                FloydsTriangle();
                break;
            case 9:
                Triangle01();
                break;
            case 10:
                Butterfly();
            case 11:
                Rhombus();
                break;
            case 12:
                HollowRhombus();
                break;
            case 13:
                Diamond();
                break;
            case 14:
                NumberPyramid();
                break;
            case 15:
                Palindrome();
                break;
            case 16:
                Mountain();
                break;
            default:
                System.out.println("Wrong Button.");
                break;
        }
        sc.close();
    }
}

// Pattern Problems
