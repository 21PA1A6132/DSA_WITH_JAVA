package basicmaths;
import java.util.*;
public class Fibonacci_num {
    public static int fibo_num(int n){
        int a =0;
        int b= 1;
        if(n<=1){
            return n;
        }
        while(n>1){
            int temp = b;
            b = a+b;
            a = temp;
            n--;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(n +"th Fibonacci number is : "+fibo_num(n));
    }
}
