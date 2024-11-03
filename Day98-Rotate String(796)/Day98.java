class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length()){
            return false;
        }
        else{
            String sps = s + s;
            if(sps.contains(goal)){
                return true;
            }
        }

    return false;
    }
}
