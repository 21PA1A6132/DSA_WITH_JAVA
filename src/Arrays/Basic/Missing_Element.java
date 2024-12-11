package Arrays.Basic;

import java.util.HashMap;
import java.util.Scanner;

public class Missing_Element {
    static int miss_ele_brute(int[] arr, int n){
        for(int i =1;i<n;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
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
        int sum1 = (n*(n+1))/2;
        int sum2=0;
        for(int x:arr){
            sum2+=x;
        }
        return sum1-sum2;
    }
    static int miss_ele(int[]arr,int n){
        int xor1 =0;
        int xor2 =0;
        for(int i =0;i<n-1;i++){
            xor1 ^=arr[i]; //(xor of all elements in the array upto n-1th index) ex : [1,2,3,5] xor1 = 1^2^3^4
            xor2 ^=i+1; //(xor of elements 1 to n-1) --> xor2 = 1^2^3
        }
        xor2 ^=n;
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
