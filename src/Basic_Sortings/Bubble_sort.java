package Basic_Sortings;
import java.util.*;

public class Bubble_sort {
    public static void bub_sort(ArrayList<Integer> arr,int n){
        for(int i=n-1;i>0;i--){
            boolean did_swap = false;
            for(int j=0;j<=i-1;j++){
                if(arr.get(j)>arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                    did_swap = true;
                }
            }
            if(!did_swap){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr  = new ArrayList<>();
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Original Array: " + arr);
        bub_sort(arr, n);
        System.out.println("Sorted Array: " + arr);

    }
}
