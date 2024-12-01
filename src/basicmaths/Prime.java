package basicmaths;
import java.util.*;
public class Prime {
    public static boolean isPrime(int N) {
        if(N<=1){
            return false;
        }
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int N) {
        if(N<=1){
            return false;
        }
        if(N<=3){
            return true;
        }
        if(N%2==0 || N%3==0){
            return false;
        }
        for (int i = 5; i * i <= N; i+=6) {
            if (N % i == 0 || N%(i+2)==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        if(isPrime(N)){
            System.out.println("The Given number " + N + " is prime");
        }
        else{
            System.out.println("The Given number " + N + " is not prime");
        }
    }
}
