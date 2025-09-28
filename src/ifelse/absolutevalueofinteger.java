package ifelse;
import java.util.Scanner;
public class absolutevalueofinteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        if(n<0) n=-n;
        System.out.println(n);
    }
}
