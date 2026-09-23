class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum =nums[0], cur =nums[0];
        for(int i=1;i<nums.length;i++){
         cur =Math.max(nums[i],cur+nums[i]);
            maxsum = Math.max(cur,maxsum);
        }return maxsum;
    }
}