class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean ans = false;

        for(int i = 0; i < n; i++){
            if(hm.containsKey(arr[i])){
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        HashMap<Integer, Boolean> freqMap = new HashMap<>();
        for (int value : hm.values()) {
            if (freqMap.containsKey(value)) {
                ans = false;
                break;
            } else {
                freqMap.put(value, true);
                ans = true;
            }
        }

        return ans;
    }
}
