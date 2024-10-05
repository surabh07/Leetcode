class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashMap <String, Integer> hs = new HashMap<>();
        String[] temp1 = s1.split(" ");
        String[] temp2 = s2.split(" ");

        for(int i=0;i<temp1.length;i++){
            if(hs.containsKey(temp1[i])){
                int temp = hs.get(temp1[i]);
                hs.put(temp1[i], temp+1);
            }
            else{
                hs.put(temp1[i], 1);
            }
        }

        for(int i=0;i<temp2.length;i++){
            if(hs.containsKey(temp2[i])){
                int temp = hs.get(temp2[i]);
                hs.put(temp2[i], temp+1);
            }
            else{
                hs.put(temp2[i], 1);
            }
        }

        ArrayList <String> al = new ArrayList<>();
 
        for(String i : hs.keySet()){
            if(hs.get(i) == 1){
                al.add(i);
            }
        }

        String[] result = al.toArray(new String[0]);

        return result;
    }
}
