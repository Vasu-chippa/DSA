class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int l=0,r=nums.length-1;
        int s=Integer.MIN_VALUE;
        while(l<r){
            s=nums[l]+nums[r];
            if(s==tar) return new int[]{l+1,r+1};
            else if(s<tar) l++;
            else r--;
        }return new int[]{};
    }
}