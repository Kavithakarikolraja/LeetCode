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
    public int diameterOfBinaryTree(TreeNode root) {
        
        
        return diameter(root);
    }

    public int diameter(TreeNode root)
    {
        if(root==null) return 0;

        int left = diameter(root.left);
        int right = diameter(root.right);
        int dia = height(root.left)+height(root.right);

        return Math.max(dia,Math.max(left,right));
    }

    public int height(TreeNode root)
    {
        if(root==null) return 0;

        return 1+Math.max(height(root.left),height(root.right));
    }
}