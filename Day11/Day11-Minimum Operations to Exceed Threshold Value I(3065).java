class Solution {
    public int minOperations(int[] nums, int k) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        
        for(int i=0;i<n-1;i++){
            if(k>nums[i]){
                for(int j=0;j<n;j++){
                    nums[i] = nums[i+1];
                }
                count++;
            }
            else{
                return count;
            }
        }
        return count;
    }
}
