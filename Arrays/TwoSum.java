package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int result=arr[i]+arr[j];
                if(result==target)
                {
                    System.out.println(i+" "+j);
                    return;
                }

            }
        }
        System.out.println("No Pair found");
    }
}
