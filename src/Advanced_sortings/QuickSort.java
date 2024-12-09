package Advanced_sortings;
import java.util.*;
public class QuickSort {
    public static int  partiton(int[] arr,int low,int high){
        int pivot= arr[low];
        int i = low+1;
        int j = high;
        while(i<=j){
            while(i<=high && arr[i]<=pivot ){
                i++;
            }
            while(j>=low &&arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }
        arr[low] = arr[j];
        arr[j]=pivot;
        return j;


    }
    public static void quicksort(int[] arr ,int low, int high){
        if(low<=high){
            int pivot_idx = partiton(arr,low,high);
            quicksort(arr,0,pivot_idx-1);
            quicksort(arr,pivot_idx+1,high);
        }

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
        quicksort(arr,0, n-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}
