package loops;

public class alloddnumdivisibleby3from1to100 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if(i%3==0 && i%2!=0) System.out.println(i);
        }
    }
}
