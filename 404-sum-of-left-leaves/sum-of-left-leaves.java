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
    public int sumOfLeftLeaves(TreeNode root) {
        
        return counter(root);
    }

    public int counter(TreeNode node)
    {
        if(node==null) return 0;

        int count = 0;

        if (node.left != null && node.left.left == null && node.left.right == null) {
           count+= node.left.val;
        }
        
         count += counter(node.left);
         
          count += counter(node.right);

        return count;
    }
}