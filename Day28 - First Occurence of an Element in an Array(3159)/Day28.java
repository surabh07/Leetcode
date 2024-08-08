class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                pos.add(i);
            }
        }
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] <= pos.size()) {
                result[i] = pos.get(queries[i] - 1);
            } else {
                result[i] = -1;
            }
        }
        
        return result;
    }
}
