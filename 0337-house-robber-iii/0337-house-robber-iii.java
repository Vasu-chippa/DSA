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
    static int[] dfs(TreeNode root){
        if(root==null) return new int[]{0,0};
        int[] leftc=dfs(root.left);
        int[] rightc=dfs(root.right);
        int rob= root.val +leftc[1]+rightc[1];
        int skip = Math.max(leftc[0],leftc[1]) + Math.max(rightc[0],rightc[1]);
        return new int[]{rob,skip};
    }
    public int rob(TreeNode root) {
        int[] arr = dfs(root);
        return Math.max(arr[0],arr[1]);
    }
}