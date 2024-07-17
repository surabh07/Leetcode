class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int  k = sc.nextInt();
        rotate(arr, k);
    }
    public static void rotate(int[] nums, int k) {
        
        k%=nums.length;
        int n = nums.length;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);

        for(int i=0;i<n;i++){
            System.out.print(nums[i]+ " ");
        }

    }

    public static void reverse(int s,int e,int[] arr){
        int temp;
        while(s<e){
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
