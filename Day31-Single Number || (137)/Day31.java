class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap <Integer, Integer> hm = new HashMap<>();

        for(int i : nums){
            if(hm.containsKey(i)){
                int temp = hm.get(i);
                hm.put(i, temp+1);
            }
            else{
                hm.put(i, 1);
            }
        }

        for(int i : hm.keySet()){
            if(hm.get(i) == 1){
                return i;
            }
        }

        return -1;
    }
}
