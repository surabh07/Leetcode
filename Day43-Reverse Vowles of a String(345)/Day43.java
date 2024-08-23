class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (isVowel(ch[start])) {
                if (isVowel(ch[end])) {
                    char temp = ch[start];
                    ch[start] = ch[end];
                    ch[end] = temp;
                    start++;
                }
                end--;
            } else {
                start++;
            }
        }

        return new String(ch);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
