class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int lo = 2;
        int hi = n-3;

        if(arr.length==1){
            return arr[n-1];
        }

        if(arr[0] != arr[1]){
            return arr[0];
        }

        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }

        while(lo<=hi){

            int m = (lo+hi)/2;

            if(arr[m]!=arr[m-1] && arr[m]!=arr[m+1]){
                return arr[m];
            } 

            if(arr[m] == arr[m-1]){
                m--;
            }

            if(m%2==0){
                lo = m+2;
            }
            else{
                hi = m-1;
            }
        }
    return -1;
    }
}
