class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;
        int hi = n-1;
        int lo = 0;
        int[] res = new int[2];

        while(lo<=hi){
            int sum = numbers[lo]+numbers[hi];
            if(sum == target){
                return new int[] {lo+1,hi+1};
            }

            if(sum > target){
                hi = hi - 1;
            }

            if(sum < target){
                lo = lo + 1;
            }
        }

    return new int[0];
    }
}
