package patternprintinglec4;

import java.util.Scanner;

public class bridgeprint2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=1;
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            nsp+=2;
            System.out.println();
        }


    }
}
