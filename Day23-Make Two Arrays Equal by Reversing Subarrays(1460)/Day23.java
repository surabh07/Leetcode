class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int n = target.length;
        int m = arr.length;
        boolean flip = false;

        Arrays.sort(arr);
        Arrays.sort(target);

        for(int i=0;i<n;i++){
            if(arr[i] == target[i]){
                flip = true;
            }
            else{
                flip = false;
                break;
            }
        }

        if(flip == true){
            return true;
        }

        return false;
    }

}
