package Arrays.Basic;

import java.util.Scanner;

public class Sorted_Array {
    public static boolean is_sorted(int[]arr,int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (is_sorted(arr, n)) {
            System.out.println("The given array is sorted");
        }
        else{
            System.out.println("The given array is not sorted");
        }
    }
}
