class Solution {
    public int maxVowels(String s, int k) {
        
        int n = s.length();
        int maxVowel = 0;
        int count = 0;

        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count ++;
            }
        }

        maxVowel = count;

        for(int i=k;i<n;i++){
            char addch = s.charAt(i);
            char remch = s.charAt(i-k);
            if(addch == 'a' || addch == 'e' || addch == 'i' || addch == 'o' || addch == 'u') {
                count ++;
            }
            if(remch == 'a' || remch == 'e' || remch == 'i' || remch == 'o' || remch == 'u') {
                count --;
            }
            maxVowel = Math.max(maxVowel, count);
        }
        return maxVowel;
    }
}
