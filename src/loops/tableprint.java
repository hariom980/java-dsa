package loops;
import java.util.Scanner;
import java.util.SortedMap;

public class tableprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr n");
        int n=sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
//        for(int i=1; i<=10; i++){
//            System.out.println(i*2);
//        }
    }
}
