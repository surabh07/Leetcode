class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int i = 0;

        for(i=0;i<n;i++){
            if(nums[i] == target){
                return i;
            }
            else{
                if(nums[i]>target){
                    return i;
                }
            }
        }
        return i;
    }
}
