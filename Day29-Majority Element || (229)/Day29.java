class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            int x = nums[i]; 
            int count = 0; 

            while (j < nums.length && nums[j] == x) {
                count++;
                j++;
            }

            if (count > nums.length / 3) {
                list.add(x); 
            }

            i = j; 
        }

        return list;
    }
}
