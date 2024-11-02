class Solution {
    public String removeStars(String s) {
        
        Stack <Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        char[] ans = new char[st.size()];

        for(int i=ans.length-1;i>=0;i--){
            ans[i] = st.pop();
        } 

        String res = String.valueOf(ans);

    return res;
    }
}
