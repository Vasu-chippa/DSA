class Solution {
    public int search(int[] nums, int target) {
        List<Integer> arr=new ArrayList<>();
        for(int i:nums)arr.add(i);
       return arr.indexOf(target); 
    }
}