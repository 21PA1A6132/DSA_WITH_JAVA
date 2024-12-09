package Arrays.Basic;
import java.util.*;
public class Left_Rotate {
    static void single_rotate(int[] arr,int n){
        int temp = arr[0];
        for(int i =1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    static void k_rotate(int[] arr,int n,int k){
        int[] temp = new int[k];
        for(int i =0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int j =k;j<n;j++){
            arr[j-k] = arr[j];
        }
        for(int i =0;i<k;i++){
           arr[n-k+i] = temp[i];
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
