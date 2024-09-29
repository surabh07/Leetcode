class Solution {
    public int maxCoins(int[] piles) {
        
        int n = piles.length;
        int b = n/3;
        Arrays.sort(piles);
        int coins = 0;

        for(int i=n-2;i>=b;i=i-2){
            coins = coins + piles[i];
        }

    return coins;

    }
}
