package basicmaths;
import java.util.*;

public class Power {
    public static double pow(int x, int y) {
        if (y == 0) {
            return 1; // Base case: Any number to the power of 0 is 1
        }
        if (x == 0) {
            return 0; // Any power of 0 (except 0^0) is 0
        }

        double result = 1;
        int exponent = Math.abs(y); // Handle negative exponents
        while (exponent > 0) {
            if (exponent % 2 == 1) { // If the current exponent is odd
                result *= x;
            }
            x *= x; // Square the base
            exponent /= 2; // Halve the exponent
        }

        return y < 0 ? 1.0 / result : result; // Adjust for negative exponent
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = in.nextInt();
        System.out.print("Enter the exponent: ");
        int power = in.nextInt();

        if (number == 0 && power <= 0) {
            System.out.println("Undefined result (0 raised to 0 or a negative power).");
        } else {
            System.out.println(number + " ^ " + power + " = " + pow(number, power));
        }
    }
}
