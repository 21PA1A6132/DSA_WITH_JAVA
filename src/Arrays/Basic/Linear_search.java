package Arrays.Basic;
import java.util.*;
public class Linear_search {
    static int ls(int[] arr , int x){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter the element to search : ");
        int x =sc.nextInt();
        int ans = ls(arr,x);
        if(ans!=-1){
            System.out.printf("Element is %d found at index %d ",x,ans);
        }
        else{
            System.out.printf("Given element %d is not found in the array ",x);
        }
    }
}

