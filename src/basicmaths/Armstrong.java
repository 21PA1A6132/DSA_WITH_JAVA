package basicmaths;
import java.util.*;
public class Armstrong {
    public static int countDigits(int n) {
        int count =0;
        while (n>0){
            n = n/10;
            count+=1;
        }
        return count;
    }
    public static boolean isArmstrong(int n){
        int num =n;
        int arm =0;
        int pow = countDigits(n);
        while(n>0){
            arm+=(int) Math.pow(n%10,pow);
            n = n/10;
        }
        return (num==arm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int count = countDigits(a);
        System.out.println("The number of digits in " + a + " are "+count);
        if(isArmstrong(a)){
            System.out.println("The Given number " + a + " is an armstrong number");
        }
        else{
            System.out.println("The Given number " + a + " is not an armstrong number");
        }
    }
}
