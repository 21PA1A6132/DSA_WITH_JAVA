package basicrecursion;

import java.util.Scanner;

public class Fibonacci_num {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(n +"th Fibonacci number is : "+fibonacci(n));
        fibonacci(n);
    }

}
