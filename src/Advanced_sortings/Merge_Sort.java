package Advanced_sortings;
import java.util.*;
public class Merge_Sort {
    public static void merge(int[] arr,int low, int mid,int high){
        int size = high-low+1;
        int[] temp = new int[size];
        int left = low;
        int right = mid+1;
        int i=0;
        while(i<size && left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i] = arr[left];
                left++;
            }
            else{
                temp[i]=arr[right];
                right++;
            }
            i++;
        }
        while(i<size && left<=mid){
            temp[i] = arr[left];
            left++;
            i++;
        }
        while(i<size && right<=high){
            temp[i]=arr[right];
            right++;
            i++;
        }
        for(int j =low;j<=high;j++){
            arr[j]=temp[j-low];
        }
    }
    public static void merge_sort(int[] arr, int l, int r){
        if(r<=l){
            return;
        }
        int mid = (l+r)/2;
        merge_sort(arr,l,mid);
        merge_sort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        merge_sort(arr, 0,n-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}
