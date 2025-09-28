package basics;
import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        Scanner hariom=new Scanner(System.in);
        System.out.println("enter value of aman");
         int aman=hariom.nextInt();
        System.out.println("value of shivam");
         int shivam=hariom.nextInt();
        System.out.println("enetr value of divya");
         int divyanshu=hariom.nextInt();
        System.out.println("the total value of aman shivam and divya is :");
        System.out.println(aman+shivam+divyanshu);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enetr a value of a");
//        double r=sc.nextInt();
//        double a=3.141592*r*r;
//        System.out.println(a);
    }
}
