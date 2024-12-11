package Arrays.Basic;

import java.util.Scanner;

public class Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max_count = Integer.MIN_VALUE;
        int count =0;
        for(int i:nums){
            if(i==1){
                count+=1;
            }
            else{
                max_count = (max_count>count)?max_count:count;
                count =0;
            }
        }
        max_count = (max_count>count)?max_count:count;
        return max_count;
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
        System.out.printf("The maximum number of consecutive 1's in the given araay = %d",findMaxConsecutiveOnes(arr));
    }
}
