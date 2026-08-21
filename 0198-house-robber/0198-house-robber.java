class Solution {
    static int find(int[] arr, int i,int[] dp){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int rb = arr[i] +find(arr,i+2,dp);
        int n = find(arr,i+1,dp);
        return dp[i]=Math.max(rb,n);
    }
    public int rob(int[] nums) {
        int[] m = new int[nums.length];
        Arrays.fill(m,-1);
       return find(nums,0,m);
    }
}