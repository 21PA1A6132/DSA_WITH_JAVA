package Arrays.Basic;

import java.util.Scanner;

public class Second_Largest {
    public static int max_arr(int[] arr, int n) {
        if (n < 2) {
            System.out.println("Array must have at least 2 elements!");
            return -1;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) { //For Equal elements 99 99 98 (sl !=99 ;sl =98)
                max2 = arr[i];
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists!"); //equal elements 100 100 100
            return -1;
        }

        return max2;
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
        int result = max_arr(arr, n);
        if (result != -1) {
            System.out.println("Second Largest Element in the Array is: " + result);
        }
    }
}
