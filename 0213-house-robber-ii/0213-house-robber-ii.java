class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int rob1= lrob(nums,0, nums.length-2);
        int rob2= lrob(nums,1,nums.length-1);
        return Math.max(rob1,rob2);
    }
    public static int lrob(int[] nums, int st,int end){
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int p2=0,p1=0;
        for(int i=st;i<=end;i++){
            int cur = Math.max(p2+nums[i], p1);
            p2=p1;
            p1=cur;
        }return p1;
    }
}