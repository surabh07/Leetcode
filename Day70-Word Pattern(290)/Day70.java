class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> hm = new HashMap<>();

        String[] arrstr = s.split(" ");

        if (pattern.length() != arrstr.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            if (hm.containsKey(pattern.charAt(i)) == false){
                if (hm.containsValue(arrstr[i]) == false) {
                    hm.put(pattern.charAt(i), arrstr[i]);
                } else {
                    return false;
                }
            } 
            else {
                if (arrstr[i].compareTo(hm.get(pattern.charAt(i))) != 0) {
                    return false;
                }
            }

        }
        return true;
    }
}
