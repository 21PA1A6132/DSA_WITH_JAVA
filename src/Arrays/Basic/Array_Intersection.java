package Arrays.Basic;
import java.util.*;

public class Array_Intersection {

    public static List<Integer> intersectionarray(int[] a, int[] b) {
        List<Integer> ans = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;
        int temp = Integer.MIN_VALUE; //

        while (i < n1 && j < n2) {
            if (a[i] == b[j]) {
                if (temp != a[i]) {
                    ans.add(a[i]);
                    temp = a[i];
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++; // Move the pointer for the smaller value
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the 1st Array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the 2nd Array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("The Intersection of the Given Arrays is: " + intersectionarray(a, b));
    }
}
