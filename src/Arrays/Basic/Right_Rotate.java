package Arrays.Basic;
import java.util.*;
public class Right_Rotate {
    static void single_rotate(int[] arr,int n){
        int temp = arr[n-1];
        for(int i =n-1;i>=0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    static void k_rotate(int[] arr,int n,int k){
        int[] temp = new int[k];
        for(int i =0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        for(int j =n-1;j>=k;j--){
            arr[j] = arr[j-k];
        }
        for(int i =0;i<k;i++){
            arr[i] = temp[i];
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
        System.out.println("Original Array is : "+ Arrays.toString(arr));
        System.out.print("Enter the Value of K : ");
        int k = sc.nextInt();
        k = k%n;
        if(k==1){
            single_rotate(arr,n);
            System.out.println("Rotated  Array is : " + Arrays.toString(arr));
        }
        else{
            k_rotate(arr,n,k);
            System.out.println("Rotated  Array is : " + Arrays.toString(arr));
        }

    }
}
