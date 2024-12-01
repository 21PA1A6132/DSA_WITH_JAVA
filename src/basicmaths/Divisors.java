package basicmaths;
import java.util.*;

class Divisors {
    public static ArrayList<Integer> PrintDivisors(int N) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                factors.add(i);
            }
        }

        for (int i = (int) Math.sqrt(N); i >= 1; i--) {
            if (N % i == 0 && i != N / i) {
                factors.add(N / i);
            }
        }

        return factors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        ArrayList<Integer> div = PrintDivisors(N);
        System.out.println("The Divisors of " + N + " are: " + div);
    }
}
