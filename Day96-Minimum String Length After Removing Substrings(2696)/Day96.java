class Solution {
    public int minLength(String s) {
        int n = s.length();
        
        Stack <Character> st = new Stack<>();
        int length = 0;

        for(int i=0;i<n;i++){
            if(st.size()==0){
                st.push(s.charAt(i));
                length++;
            }
            
            else if(s.charAt(i)=='B' && st.peek()=='A'){
                st.pop();
                length--;
            }

            else if(s.charAt(i)=='D' && st.peek()=='C'){
                st.pop();
                length--;
            }

            else {
                st.push(s.charAt(i));
                length++;
            }
        }

    return length;
    }
}
