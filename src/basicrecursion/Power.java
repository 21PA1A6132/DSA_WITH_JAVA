package basicrecursion;

import java.util.*;

public class Power {
    public static int pow(int x,int y){
        if(x==0 || x==1 || y==1){
            return x;
        }
        if(y==0){
            return 1;
        }
        if(y%2!=0){
            return x*pow(x,y-1);
        }
        return pow(x*x,y/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        System.out.println(num + " ^ " + power+ " = "+ pow(num,power));
    }
}
