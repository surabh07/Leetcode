class Solution {
    public int romanToInt(String s) {
        
        char[] ch = s.toCharArray();
        int n = s.length();
        int ans = 0;
        HashMap <Character, Integer> hm = new HashMap <>();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        for(int i=0;i<n-1;i++){
            if(hm.get(ch[i]) < hm.get(ch[i+1])){
                ans = ans - hm.get(ch[i]);
            }
            else{
                ans = ans + hm.get(ch[i]);;
            }
        }

        ans = ans + hm.get(ch[n-1]);

        return ans;
    }
}
