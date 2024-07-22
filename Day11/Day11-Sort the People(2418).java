class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;

        HashMap <Integer, String> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            hm.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        reverse(heights);

        for(int i=0;i<n;i++){
            String temp = hm.get(heights[i]);
            names[i] = temp;
        }

        return names;
    }

    public static void reverse(int[] heights){
        int sp = 0;
        int ep = heights.length-1;

        while(sp<ep){
            int temp = heights[sp];
            heights[sp] = heights[ep];
            heights[ep] = temp;

            sp++;
            ep--;
        }
    }
}
