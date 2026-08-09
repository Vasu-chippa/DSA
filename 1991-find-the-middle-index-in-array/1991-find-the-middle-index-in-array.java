class Solution {
    public int findMiddleIndex(int[] nums) {
        int n= nums.length;
        int tsum =0, lsum=0;
        for(int x: nums) tsum+=x;
        for(int i=0;i<nums.length;i++){
           tsum-=nums[i];
           if(tsum==lsum) return i;
           lsum+=nums[i];
        }return -1;
    }
}