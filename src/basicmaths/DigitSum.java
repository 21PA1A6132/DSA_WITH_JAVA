package basicmaths;
import java.util.*;

public class DigitSum {
    public static int sumDigits(int n) {
        int sum =0;
        while (n>0){
            sum+=n%10;
            n = n/10;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int count = sumDigits(a);
        System.out.println("The sum of digits of " + a + " are "+count);
    }
}
