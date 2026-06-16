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
    public boolean isBalanced(TreeNode root) {
        
        return checkHeight(root)!=-1;
    }


    public int checkHeight(TreeNode root)
    {
        if(root == null) return 0;

        int left_h = checkHeight(root.left);
        if(left_h ==-1) return -1;

        int right_h = checkHeight(root.right);
        if(right_h ==-1) return -1;

        if(Math.abs(left_h-right_h)>1) return -1;


       return Math.max(left_h,right_h) + 1;
    }
}