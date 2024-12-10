package Arrays.Basic;
import java.util.*;
public class Move_zeros {

    static void zero_shift_brute(int[] arr,int n){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int size = temp.size();
        for(int i =0;i<size;i++){
            arr[i]=temp.get(i);
        }
        for(int i = size;i<n;i++){
            arr[i]=0;
        }
    }
    static void zero_shift(int[] arr,int n){
        int j= -1;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                j =i;
                break;
            }
        }
        if(j!=-1){
            for(int i=j+1;i<n;i++){
                if(arr[i]!=0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is : " + Arrays.toString(arr));
        zero_shift(arr,n);
        System.out.println("Array After shifting zeros : "+Arrays.toString(arr));
    }
}
