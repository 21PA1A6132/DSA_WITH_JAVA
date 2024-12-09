package Arrays.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotate_Rec {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void k_rotate_in_place(int[] arr, int n, int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is : " + Arrays.toString(arr));
        System.out.print("Enter the Value of K : ");
        int k = sc.nextInt();
        k = k % n;
        k_rotate_in_place(arr, n, k);
        System.out.println("Rotated  Array is : " + Arrays.toString(arr));
    }
}
