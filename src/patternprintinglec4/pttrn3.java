package patternprintinglec4;
import java.util.Scanner;

public class pttrn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==3 || j==3) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
