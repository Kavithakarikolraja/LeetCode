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
    public int minDepth(TreeNode root) {
        
        int res = minDepth_helper(root);

        return res;
    }

    public int minDepth_helper(TreeNode proc)
    {
        if(proc==null)
        {
            return 0;
        }

        if(proc.left==null) return 1+minDepth_helper(proc.right);
        if(proc.right==null) return 1+minDepth_helper(proc.left);


        return 1+Math.min(minDepth_helper(proc.left), minDepth_helper(proc.right));
    }
}