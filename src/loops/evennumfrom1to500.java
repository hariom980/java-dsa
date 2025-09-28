package loops;
import java.util.Scanner;

public class evennumfrom1to500 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2==0) System.out.print(i+" ");
        }

//        for(int i=1; i<=500; i++){
//            if(i%2==0) System.out.println(i);
//        }
    }
}
