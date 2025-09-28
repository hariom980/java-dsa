package patternprintinglec4;
import java.util.Scanner;

public class reactangleprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || i==5 || j==1 || j==7) System.out.print("*");

                else System.out.print(" ");
            }
            System.out.println();

        }

//        int row=sc.nextInt();
//        int col=sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i==1 && i==5 && j==1 && j==7){
//                    System.out.println("* ");
//                    else if{
//                        System.out.println(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }

    }
}
