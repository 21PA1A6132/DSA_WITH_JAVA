package basicmaths;
import java.util.*;
public class Fibonacci_series {
    public static void fibo_seq(int n){
        int a =0;
        int b= 1;
        System.out.print(a + " ");
        while(n>1){
            System.out.print(b + " ");
            int temp = b;
            b = a+b;
            a = temp;
            n--;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Terms");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series up to " + n + " terms:");
        fibo_seq(n);
    }
}
