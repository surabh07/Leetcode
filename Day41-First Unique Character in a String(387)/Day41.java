class Solution {
    public int firstUniqChar(String s) {
        
        int n = s.length();

        HashMap <Character, Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            if(hm.containsKey(s.charAt(i))){
                int temp = hm.get(s.charAt(i));
                hm.put(s.charAt(i), temp + 1);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }

        for(int i=0;i<n;i++){
            if(hm.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}
