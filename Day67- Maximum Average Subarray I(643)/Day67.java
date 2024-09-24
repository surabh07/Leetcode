class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int len = nums.length;
        double max = Integer.MIN_VALUE; 
        double sum = 0;

        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        max = sum;
        
        int l = 0, r = k - 1;

        while (r < len - 1) {
            sum = sum - nums[l];
            l++;
            r++;
            sum = sum + nums[r];
            
            max = Math.max(sum, max);
        }

        return max / k;
    }
}
