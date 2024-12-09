package basicmaths;

import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String name){
        int n = name.length();
        for(int i= 0;i<=n-1;i++){
            if(name.charAt(i)!= name.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(palindrome(name)){
            System.out.println("Given String  "+name + " is a palindrome");
        }
        else{
            System.out.println("Given String  "+name + " is not a palindrome");
        }
    }
}
