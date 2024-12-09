package basicrecursion;

import java.util.*;
public class Fibonacci_series {
    public static void fibo_seq(int n, int a, int b) {
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        fibo_seq(n - 1, b, a + b);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printFiboSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " "); // Print Fibonacci number at index i
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Terms");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series up to " + n + " terms:");
        fibo_seq(n,0,1);
    }
}
