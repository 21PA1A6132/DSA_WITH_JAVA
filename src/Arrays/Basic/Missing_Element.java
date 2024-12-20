package Arrays.Basic;

import java.util.HashMap;
import java.util.Scanner;

public class Missing_Element {
    static int miss_ele_brute(int[] arr, int n){
        for(int i =1;i<n;i++){
            boolean flag=true;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return i;
            }

        }
        return -1;
    }
    static int miss_ele_better(int[]arr,int n){
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i =0;i<n;i++){
            hash.put(arr[i],1);
        }
        for(int i =1;i<n;i++){
            if(!hash.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
    static int miss_ele_best(int[]arr,int n){
        int sum_n = (n*(n+1))/2;
        int sum_arr=0;
        for(int x:arr){
            sum_arr+=x;
        }
        return sum_n-sum_arr;
    }
    static int miss_ele(int[]arr,int n){
        int xor1 =0;
        int xor2 =0;
        for(int i =0;i<n-1;i++){
            xor2 ^=arr[i]; //(xor of all elements in the array upto n-1th index) ex : [1,2,3,5] xor1 = 1^2^3^4
            xor1 ^=i+1; //(xor of elements 1 to n-1) --> xor2 = 1^2^3
        }
        xor1 ^=n;
        return xor1^xor2;
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
        int ans = miss_ele(arr,n);
        if(ans!=-1){
            System.out.printf("The element missing in the array is %d",ans);
        }
    }
}
