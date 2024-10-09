class Solution {
    public String getHint(String secret, String guess) {
        
        int cows = 0;
        int bull = 0;

        HashMap <Character, Integer> hm = new HashMap<>();

        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bull++;
            }
            else{
                if(hm.containsKey(secret.charAt(i))){
                    int temp = hm.get(secret.charAt(i));
                    hm.put(secret.charAt(i), temp+1);
                }
                else{
                    hm.put(secret.charAt(i), 1);
                }
            }
        }

        for(int i=0;i<guess.length();i++){
            if(secret.charAt(i) != guess.charAt(i)){
                char ch = guess.charAt(i);
                if(hm.containsKey(ch) && hm.get(ch) > 0){
                    cows++;
                    hm.put(ch, hm.get(ch)-1);
                }
            }
        }

    return bull + "A" + cows + "B"; 
    }
}
