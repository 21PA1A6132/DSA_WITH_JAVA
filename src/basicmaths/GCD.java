package basicmaths;

import java.util.*;

class GCD {
    public static int hcf(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a == 0) ? b : a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();

        int gcd = hcf(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
    }
}

