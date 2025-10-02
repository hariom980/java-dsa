package patternprintinglec4;
import java.util.Scanner;

public class starverticallyflippedtriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=1; i<=n; i++){
         for(int j=1; j<=n-i+1; j++){
             System.out.print(" ");
         }
         for(int j=1; j<=i; j++){
             System.out.print(j);
         }
         System.out.println();
     }
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=n; j++){
//             if(i+j>n) System.out.print(j);
//             else System.out.print(" ");
//         }
//         System.out.println();
//     }
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print(" ");
////                if(i+j>n) System.out.print("* ");
////                else System.out.print("  ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

    }
}
