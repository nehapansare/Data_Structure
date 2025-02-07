package Arrays;

public class MaxSubarray {
    public static void main(String[] args) {
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
       int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
        int currsum=0;
        for(int j=i;j<nums.length;j++)
        {
            currsum+=nums[j];
            if(currsum>max)
            {
                max=currsum;
            }

        }
       }
       System.out.println(max);
       
    }
}
