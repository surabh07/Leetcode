class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);
        int n = tokens.length;
        int score = 0;
        int lo = 0, hi = n - 1;
        int maxscore = 0;

        while (lo <= hi) {
            if (power >= tokens[lo]) {
                power = power - tokens[lo];
                score++;
                lo++;
                maxscore = Math.max(score, maxscore);
            } else if (score > 0) {
                power = power + tokens[hi];
                score--;
                hi--;
            } else {
                break;
            }
        }

        return maxscore;
    }
}
