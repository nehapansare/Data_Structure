package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr={1,8,7,56,90};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>max)
           {
            max=arr[i];
           }
        }
        System.out.println("Largest Element: " + max);
    }
}
