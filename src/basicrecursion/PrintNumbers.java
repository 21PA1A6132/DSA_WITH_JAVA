package basicrecursion;
import java.util.*;

import static javax.swing.text.html.HTML.Attribute.N;

public class PrintNumbers {
    public static void print_1_n(int n) {
        if(n<1) {
            return;
        }
        print_1_n(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        print_1_n(num);
    }
}
