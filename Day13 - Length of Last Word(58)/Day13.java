class Solution {
    public int lengthOfLastWord(String s) {

        int length = 0;

        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);

            if(c>=65 && c<=90){
                length++;
            }
            else if(c>=97 && c<=122){
                length++;
            }
            else if(c>=48 && c<=57){
                length++;
            }
            else if(c == ' ' && length > 0){
                break;
            }
        }

        return length;
    }
}
