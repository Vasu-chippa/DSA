/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int c=0;
    public int kthSmallest(TreeNode root, int k) {
        c=0;
        return fun(root,k);
    }
    public int fun(TreeNode root, int k) {
        if(root==null) return -1;
        int left = fun(root.left,k);
        if(left!=-1){
            return left;
        }
        c++;
        if(c==k) return root.val;
        return fun(root.right,k);
    }
}