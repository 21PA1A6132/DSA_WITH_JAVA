package basicmaths;


import java.util.*;

public class PrimeFactors {

    public static ArrayList<Integer> primeFactors(int N) {

        ArrayList<Integer> factors = new ArrayList<>();

        if (N <= 1) {
            return factors;
        }


        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                factors.add(i);
                while (N % i == 0) {
                    N = N/i;
                }
            }
        }
        if(N!=1) {
            factors.add(N);
        }
        return factors;

    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Number:");
       int N = sc.nextInt();
       System.out.println("The Prime Factors of "+ N + " are : "+primeFactors(N));

    }
}
