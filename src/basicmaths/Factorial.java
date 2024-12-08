package basicmaths;
import java.util.*;
public class Factorial {
    public static int fact(int n){
        int factorial = 1;
        if(n==0 || n==1){
            return 1;
        }
        for(int i =2;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The factorial of "+ n + " is :" + fact(n));
    }
}
