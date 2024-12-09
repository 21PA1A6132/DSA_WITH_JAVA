package Basic_Sortings;
import java.util.*;
public class Selection_sort {
    public static void sel_sort(int[] arr, int n){
        for(int i=0;i<n-2;i++){
            int min_idx =i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            if(min_idx!=i){
                int temp= arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
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
        sel_sort(arr, n);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
