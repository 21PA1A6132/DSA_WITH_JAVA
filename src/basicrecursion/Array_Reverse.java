package basicrecursion;
import java.util.*;

public class Array_Reverse {
    public static void rev_arr(int[] arr, int left,int right) {
        if(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            rev_arr(arr,left+1,right-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        rev_arr(arr,0,n-1);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
