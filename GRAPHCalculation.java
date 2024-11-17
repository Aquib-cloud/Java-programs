import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 19; i++) {
            System.out.print("Enter Numbers : ");
            float a = sc.nextFloat();
            System.out.println(".............................." + a * 200);
        }
    }
}