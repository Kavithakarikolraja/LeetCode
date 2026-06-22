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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        maxPath(root);

        return max;

       

    }

    public int maxPath(TreeNode root)
    {
        if(root==null) return 0;

        int left_sum = Math.max(maxPath(root.left),0);
        int right_sum = Math.max(maxPath(root.right),0);
       
        int curr = left_sum + right_sum+root.val;
       
        max = Math.max(max,curr);

        return  Math.max(left_sum ,right_sum)+root.val;

    }
}