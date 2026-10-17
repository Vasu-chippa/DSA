class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        bt(nums,0,new ArrayList<>() ,res);
        return res;
    }
    public static void bt(int[] nums,int i , List<Integer> cur, List<List<Integer>> res){
        if(i==nums.length){
            res.add( new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        bt(nums,i+1,cur,res);
        cur.remove(cur.size()-1);
        bt(nums,i+1,cur,res);
    }
}