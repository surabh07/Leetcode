class Solution {
    public int findLucky(int[] arr) {
        
        int ans = 0;
        int max = Integer.MIN_VALUE;
        HashMap <Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }

        for(int i : hm.keySet()){
            if(i > max && i == hm.get(i)){
                max = i;
                ans = max;
            }
        }

        if(ans != 0){
            return ans;
        }

        return -1;
    }
}
