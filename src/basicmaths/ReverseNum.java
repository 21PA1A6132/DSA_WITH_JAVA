package basicmaths;
import java.util.*;
public class ReverseNum {
    public static int Reverse(int n) {
        int rev =0;
        while (n>0){
            rev=rev*10+n%10;
            n = n/10;

        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("The reverse of " + a + " is "+Reverse(a));
    }
}
