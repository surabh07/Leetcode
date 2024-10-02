class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] arr1 = arr.clone();
        Arrays.sort(arr1);

        HashMap<Integer, Integer> hs = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < arr.length; i++) {
            if(!hs.containsKey(arr1[i])){
                hs.put(arr1[i], rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = hs.get(arr[i]);
        }

        return arr;
    }
}
