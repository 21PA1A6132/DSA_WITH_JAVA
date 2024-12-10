package Arrays.Basic;
import java.util.*;
public class Array_Union {
    public static List< Integer > unionarray1(int[] a,int[] b){
        List <Integer> union = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set1.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            set1.add(b[j]);
        }
        for(int it:set1){
            union.add(it);
        }
        return union;
    }
    public static List< Integer > unionarray(int []a, int []b) {
        // Write your code here
        List <Integer> ans = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        int i=0,j=0;
        int temp = -1;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(temp !=a[i]){
                    ans.add(a[i]);
                    temp = a[i];
                }
                i++;
            }

            else{
                if(temp!=b[j]){
                    ans.add(b[j]);
                    temp = b[j];
                }
                j++;
            }
        }
        while(i<n1){
            if(temp !=a[i]){
                ans.add(a[i]);
                temp = a[i];
            }
            i++;
        }
        while(j<n2){
            if(temp!=b[j]){
                ans.add(b[j]);
                temp = b[j];
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 1st Array : ");
        int n1 = sc.nextInt();
        int[] a  = new int[n1];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n1;i++){
            a[i]= sc.nextInt();
        }
        System.out.print("Enter the size of the 2nd Array : ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n2;i++){
            b[i]= sc.nextInt();
        }
        System.out.println("The Union of  Given  Arrays is : " + unionarray1(a,b));
    }
}
