class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int ans = 0;

        for(int i : nums){
            if(hm.containsKey(i)){
                int temp = hm.get(i);
                hm.put(i, temp+1);
            }
            else{
                hm.put(i, 1);
            }
        }
        
        for(int i : nums){
            if(hm.get(i)>n/2)
                ans = i;
        }
        return ans;
    }
}
