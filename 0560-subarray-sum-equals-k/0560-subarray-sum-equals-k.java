class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int c=0,sum=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum += nums[i];
            int val = sum-k;
            if(map.containsKey(val)){ 
                c= c+map.get(val);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }return c;
    }
}