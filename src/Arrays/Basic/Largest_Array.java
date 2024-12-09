package Arrays.Basic;
import java.util.*;
public class Largest_Array {
    public static int max_arr(int[] arr ,int n){
        int max = arr[0];
        for(int i =1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
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
        System.out.println("Largest Element in the  Array is : " + max_arr(arr,n));
    }
}
