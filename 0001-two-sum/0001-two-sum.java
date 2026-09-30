class Solution {
    public int[] twoSum(int[] nums, int tar) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need = tar-nums[i];
            if(m.containsKey(need)){ 
                return new int[]{m.get(need),i};
            }
            m.put(nums[i],i);
        }

        return new int[]{};
    }
}