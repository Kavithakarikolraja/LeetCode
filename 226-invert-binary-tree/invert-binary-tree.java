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
    public TreeNode invertTree(TreeNode root) {
        
        return inverter(root);
    }


    public TreeNode inverter(TreeNode root)
    {
        if(root == null)
        {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        inverter(root.left);
        inverter(root.right);

        return root;
        
    }
}