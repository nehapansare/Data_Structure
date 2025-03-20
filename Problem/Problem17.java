package Problem;

import java.util.Arrays;

public class Problem17 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 9, 6, 8, 7, 4, 10};
        Arrays.sort(arr);
        int n=arr.length;
        int mid=(n+1)/2;
        int result[]=new int [n];
        for(int i=0;i<=mid;i++)
        {
            result[i]=arr[i];
        }
        int index=mid;
        for(int i=n-1;i>=mid;i--)
        {
            result[index++]=arr[i];
        }
        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }
}
