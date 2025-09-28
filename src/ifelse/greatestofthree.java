package ifelse;
import java.util.Scanner;

public class greatestofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num :");
        int a=sc.nextInt();
        System.out.println("enter 2nd num :");
        int b=sc.nextInt();
        System.out.println("enter 3rd num :");
        int c=sc.nextInt();
        if(a>b && a>c) System.out.println("a is greater");
        else if(b>a && b>c) System.out.println("b is greater");
        else if(c>a && c>b) System.out.println("c is greater");

    }
}
