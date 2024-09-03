public class Solution {
    public int getLucky(String s, int k) {

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int position = ch - 'a' + 1;
            sb.append(position);
        }
    
        String numStr = sb.toString();
        
        while (k!=0) {
            numStr = sumOfDigits(numStr);
            k--;
        }
        
        return Integer.parseInt(numStr);
    }

    public String sumOfDigits(String numStr) {
        int sum = 0;
        for (char ch : numStr.toCharArray()) {
            sum += ch - '0';
        }
        return Integer.toString(sum);
    }
}
