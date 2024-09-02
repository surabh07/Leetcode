class Solution {
    public int chalkReplacer(int[] chalk, int k) {

        int n = chalk.length;
        long total_chalk = 0;

        for(int i=0;i<n;i++){
            total_chalk = total_chalk + chalk[i];
        }

        k = (int)(k % total_chalk);

        for(int i=0;i<n;i++){
            if(k<chalk[i]){
                return i;
            }
            k -= chalk[i];
        }

        return 0;
    }
}
