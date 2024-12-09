package Advanced_sortings;
import java.util.*;
public class bub_sort_rec {
    public static void bub_sort(int[] arr, int n){
        if(n==1){
            return;
        }
        boolean did_swap = false;
        for(int j =0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                did_swap = true;
            }
        }
        if(!did_swap){
            return;
        }
        bub_sort(arr,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        bub_sort(arr, n);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}
