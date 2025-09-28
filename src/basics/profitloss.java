package basics;
import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price");
        int costprice=sc.nextInt();
        System.out.println("enter selling price");
        int sellingprice=sc.nextInt();
        if(costprice>sellingprice) System.out.println("loss is :"+(costprice-sellingprice));
        if(costprice<sellingprice)
            System.out.println("profit is :"+(sellingprice-costprice));
        else System.out.println("no profit no loss");
    }
}
