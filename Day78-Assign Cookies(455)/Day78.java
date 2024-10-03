class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int n = g.length;
        int m = s.length;
        int cookies = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j=m-1;

        if(m==0){
            return 0;
        }

        for(int i=n-1;i>=0;i--){
            if(s[j] >= g[i]){
                cookies++;
                j--;
            }
            if(j<0){
                break;
            }
        }

        return cookies;
    }
}
