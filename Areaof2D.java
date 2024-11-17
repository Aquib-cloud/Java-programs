import java.util.Scanner;

public class Areaof2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1;; i++) {

            System.out.print(
                    "\n\n                       !!!Caution: ALL THE ALPHABETS SHOULD BE IN SMALL LETTERS!!!\n\nEnter Shape Name: ");
            String Shape = sc.next();

            switch (Shape) {
                case "circle":
                    System.out.print("Please Enter the Radius of a Circle: ");
                    int radius = sc.nextInt();
                    System.out.print("The area of a circle of given radius is " + 3.14 * radius * radius);
                    break;
                case "square":
                    System.out.print("Side of a Square: ");
                    int S = sc.nextInt();
                    int AS = S * S;
                    System.out.print("The area of a Square of given Side is " + AS);
                    break;
                case "rectangle":
                    System.out.print("Length of a Rectangle: ");
                    int L = sc.nextInt();
                    System.out.print("Width of a Rectangle: ");
                    int W = sc.nextInt();
                    int AR = L * W;
                    System.out.print("The area of a Rectangle of given Dimension is " + AR);
                    break;
                case "triangle":
                    System.out.print("Base of a Triangle: ");
                    int BT = sc.nextInt();
                    System.out.print("Height of a Triangle: ");
                    int HT = sc.nextInt();
                    int AT = (BT * HT) / 2;
                    System.out.print("The area of a Triangle of given Dimensions is " + AT);
                    break;
                default:
                    System.out.println(
                            "\n\n                        Use this spellings: circle, square, rectangle, triangle.");
            }
        }
    }
}