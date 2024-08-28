class Solution {
    public int[] twoSum(int[] arr, int k) {
        
        HashMap <Integer, Integer> hm = new HashMap<>();
        int n = arr.length;

        for(int i=0;i<n;i++){
                hm.put(arr[i], i);
        }
         
        for(int i=0;i<n;i++){
            int a = arr[i];
            int b = k-a;

            if(hm.containsKey(b) && hm.get(b)!=i){
                return new int[] { i, hm.get(b) };
            }
        }
        return null;
    }
}
