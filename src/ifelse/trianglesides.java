package ifelse;
import java.util.Scanner;

public class trianglesides {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first side");
        int f=sc.nextInt();
        System.out.println("enter second side");
        int s=sc.nextInt();
        System.out.println("enter third sides");
        int t=sc.nextInt();
        if(f+s>t&&s+t>f&&t+f>s) System.out.println("triangle");
        else System.out.println("not triangle");
    }

}
