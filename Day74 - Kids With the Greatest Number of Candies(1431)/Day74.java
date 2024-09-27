class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int max = Integer.MIN_VALUE;
        int curr_kid = 0;

        for (int i = 0; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < n; i++) {
            curr_kid = candies[i] + extraCandies;
            if (curr_kid >= max) {
                result.add(i, true);
            } else {
                result.add(i, false);
            }
        }

        return result;
    }
}
