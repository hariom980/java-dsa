package patternprintinglec4;
import java.util.Scanner;

public class pyramidpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int nsp=n-1,nstr=1;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nstr; j++){
                System.out.print("* ");
            }
            nsp--;
            nstr+=2;
            System.out.println();
        }
    }
}
