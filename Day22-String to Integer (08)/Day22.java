class Solution {
    public int myAtoi(String s) {
    
        int count = 0;
        int ans = 0;
        int dig = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                continue;
            }

            if(s.charAt(i) == '-'){
                count = 1;
                continue;
            }
            
            if(s.charAt(i)<=57 && s.charAt(i)>=48){
                char c1 = s.charAt(i);
                dig = c1 - '0';
                ans = ans*10;
                ans = ans + dig;
            }
            else{
                break;                
            }
        }

        if(count == 1){
            return ans*-1;
        }

        return ans;
    }
}
