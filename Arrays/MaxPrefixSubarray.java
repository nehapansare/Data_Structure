package Arrays;

public class MaxPrefixSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max=Integer.MIN_VALUE;
        int minPrefix=0;
        int prefixSum=0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i]; 
            
            if (prefixSum - minPrefix > max) {
                max = prefixSum - minPrefix;  
            }
            
            if (prefixSum < minPrefix) {
                minPrefix = prefixSum; 
            }
        }
        System.out.println(max);
        
    }
}
