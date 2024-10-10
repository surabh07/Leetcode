class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int n = arr1.length;
        int m = arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int count = 0;
        int ans = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(Math.abs(arr1[i]-arr2[j]) > d){
                    count++;
                    if(count == m){
                        ans++;
                    }
                }
            }
            count = 0;
        }

    return ans;
    }
}
