package lec5methods;

import java.util.Scanner;

public class maxmof4num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        System.out.println (Math.max(Math.max((Math.max(a,b)),c),d));


    }
}
