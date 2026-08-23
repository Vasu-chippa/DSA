class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int num : nums) max = Math.max(max,num);
        int[] p = new int[max+1];
        int[] dp = new int[max+1];
        Arrays.fill(dp,-1);
        for(int num : nums) p[num] +=num;
        return cal(max,p,dp);
    }
    static int cal(int i,int[] p,int[] dp){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int take =p[i]+cal(i-2,p,dp);
        int ntake =cal(i-1,p,dp);
        dp[i]=Math.max(take,ntake);
        return dp[i]; 
    }
}
