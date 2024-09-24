class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;
        HashSet <Integer> hm1 = new HashSet<>();
        HashSet <Integer> hm2 = new HashSet<>();
        ArrayList <Integer> al = new ArrayList<>();

        for(int i=0;i<n;i++){
            hm1.add(nums1[i]);
        }
        
        for(int i=0;i<m;i++){
            hm2.add(nums2[i]);
        }

        for(int i : hm2){
            if(hm1.contains(i)){
                al.add(i); 
            }
        }

        int[] result = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            result[i] = al.get(i);
        }

        return result;
    }
}
