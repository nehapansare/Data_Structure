package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int first=-1;
        int second=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]<first)
            {
                second=arr[i];
            }
        }
        System.out.println(second);
        
    }
}
