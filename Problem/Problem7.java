package Problem;

public class Problem7 {
    public static void findSubarray(int[] nums, int k) {
        int left = 0, sum = 0; 

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];  

            while (sum > k && left <= right) {  
                sum -= nums[left]; 
                left++;  
            }

            if (sum == k) {  
                System.out.print("Subarray found: ");
                for (int i = left; i <= right; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
                return;
            }
        }
        System.out.println("-1");  
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 20, 3, 10, 5};
        int k = 33;  

        findSubarray(nums, k);  
    }
}
