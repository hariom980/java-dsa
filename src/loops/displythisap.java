package loops;
import java.util.Scanner;

public class displythisap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ap");
        int n=sc.nextInt();
        int a=99,d=4;
        for(int i=1; i<=99; i--){
            System.out.println(a+" ");
            a-=d;
        }

    }
}
