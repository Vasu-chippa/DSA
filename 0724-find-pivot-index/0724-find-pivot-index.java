class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length, tsum=0;
        for(int i=0;i<n;i++){
            tsum+=nums[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
             tsum-=nums[i];
            if(sum==tsum)return i;
            sum+=nums[i];
        }return -1;
    }
}