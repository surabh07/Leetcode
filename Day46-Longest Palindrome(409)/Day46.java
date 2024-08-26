class Solution {
    public int longestPalindrome(String s) {
        
        int n = s.length();
        HashMap <Character, Integer> hm = new HashMap<>();
        int length = 0;
        boolean flip = false;

        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        for(char i : hm.keySet()){
            if(hm.get(i)%2==0){
                length = length + hm.get(i);
            }
            else{
                length = length + hm.get(i) - 1;
                flip = true;
            }
        }

        if(flip == true){
            return length + 1;
        }

        return length;
    }
}
