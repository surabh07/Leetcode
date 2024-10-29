class Solution {
    public int calPoints(String[] operations) {
        
        Stack <Integer> st = new Stack<>();
        int ans = 0;

        for(int i=0;i<operations.length;i++){
            String str = operations[i];
            char ch = str.charAt(0);
            if(Character.isDigit(ch) || ch=='-'){
                st.push(Integer.parseInt(str));
            }
            else if(st.isEmpty()==false){
                if(ch == '+' && st.size()>1){
                    int x = st.pop();
                    int y = st.peek();
                    int sum = x+y;
                    st.push(x);
                    st.push(sum);
                }

                else if(ch == 'D'){
                    int x = st.peek();
                    x = x*2;
                    st.push(x);  
                }

                else if(ch == 'C'){
                    st.pop();
                }
            }
        }

        while(st.isEmpty()==false){
            ans = ans+st.pop();
        }

        return ans;
    }
}
