class Solution {
    public boolean isCircularSentence(String sentence) {
        
        boolean s = false;
        int n = sentence.length();


        for(int i=0;i<n;i++){
            char ch = sentence.charAt(i);
            if(ch == ' '){
                if(sentence.charAt(i-1) == sentence.charAt(i+1) && sentence.charAt(0) == sentence.charAt(n-1)){
                        s = true;
                }
                else{
                    return false;
                }
            }

            if(ch!= ' ' && i==n-1){
                if(sentence.charAt(0) == sentence.charAt(n-1)){
                    s = true;
                }
            }
        }
    return s;
    }
}
