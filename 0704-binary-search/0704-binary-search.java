class Solution {
    public int search(int[] nums, int t) {
       int low=0, high =nums.length-1;
       while(low<=high){
       int mid = low + (high-low)/2;
        if(nums[mid]==t) return mid;
        else if(nums[mid]<t) low =mid+1;
        else high =mid-1;
        
       }return -1;
    }
}