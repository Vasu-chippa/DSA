class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        bt(nums,0,new ArrayList<>(),res);
        return res;
    }
    public  void bt(int[] nums,int id , ArrayList<Integer> sub, List<List<Integer>> res){
        res.add(new ArrayList<>(sub));
        for(int i=id;i<nums.length;i++){
            sub.add(nums[i]);
            bt(nums,i+1,sub,res);
            sub.remove(sub.size()-1);
        }
    }
}