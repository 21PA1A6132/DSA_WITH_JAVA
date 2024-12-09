package Basic_Sortings;
import java.util.*;
public class Insertion_sort {
    public static void ins_sort1(int[] arr, int n){
        for(int i= 1;i<n;i++){
           int j =i-1;
           int key = arr[i];
           while(j>=0 && arr[j]>key){
               arr[j+1] =arr[j];
               j--;
           }
           arr[j+1]=key;

        }
    }
    public static void ins_sort(int[] arr , int n){
        for(int i=0;i<=n-1;i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp =arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
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

        System.out.println("Original Array: " + Arrays.toString(arr));
        ins_sort1(arr, n);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
