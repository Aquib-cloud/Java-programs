import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int r= sc.nextInt();
        System.out.print("Enter Number of Mountains: ");
        int num = sc.nextInt();
        for(int i = 0 ;i<r;i++){
            
          for(int l = 1 ; l<=num ; l++){
            
            for (int k=r;k>=i+1;k--){
                if(k>i+1){
                    if(k==r){
                        System.out.print(" ");
                    }else{
                    System.out.print(" ");
                    }
                }
                else{
                    System.out.print("*");
                }
            }
            for(int j = 1 ; j<=i*2-1;j++){
                System.out.print(" ");
                if(j==i*2-1){
                    System.out.print("*");
                }
            }
            for(int m = r; m>i+1;m--){
                if(m==r){
                    System.out.print(" ");
                }else{
                System.out.print(" ");
                }
            }
        }
            System.out.println();
        }
    }
}