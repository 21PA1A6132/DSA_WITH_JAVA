package Arrays.Basic;
import java.util.*;
public class Find_Single_Number {
    public static int singleNumber(int[] nums) {
        int xor =0;
        for(int i:nums){
            xor^=i;
        }
        return xor;
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
        System.out.printf("The element that occuring only once in the given araay is %d",singleNumber(arr));
    }
}
