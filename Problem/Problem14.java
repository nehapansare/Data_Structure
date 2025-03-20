package Problem;

import java.util.Arrays;

public class Problem14 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,3,4,4,4,4};
       
        int length=duplicate(arr);
          
        System.out.println("New length: " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int duplicate(int[] arr)
    {
        Arrays.sort(arr);
        int j=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[j++]=arr[i];
            }
        }
        return j;
    }
}
