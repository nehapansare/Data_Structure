package Arrays;

import java.util.Arrays;

public class SumOfDistinctElements {
    public static void main(String[] args) {
        int[] arr={1,2,2,4,5,4};
        Arrays.sort(arr);
        int sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                sum+=arr[i];
            }
        }
        System.out.print(sum);
    }
}
