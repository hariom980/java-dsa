package patternprintinglec4;
//import java.util.Scanner;

public class doubleflipedtriangle {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
      //  int n=sc.nextInt();
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=5+1-i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

}
