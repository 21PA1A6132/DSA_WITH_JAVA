package basicrecursion;
import java.util.*;

import static javax.swing.text.html.HTML.Attribute.N;

public class sumNumbers {
    public static int sum_1_n(int n) {
        if(n==1) {
            return 1;
        }
        return n+sum_1_n(n-1);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("The sum of first "+ N +" numbers is : "+sum_1_n(num));
    }
}
