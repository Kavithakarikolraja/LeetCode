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
        int total = 0;
    public int findTilt(TreeNode root) {
        
        /*if(root==null) return 0;
        total += Math.abs(find(root.left)- find(root.right));
        findTilt(root.left);
        findTilt(root.right);*/

        find(root);
        return total;
    }


    public int find(TreeNode root)
    {
        if(root==null) return 0;

        int l_target = find(root.left);
        int r_target = find(root.right);
        total += Math.abs(l_target-r_target);

        return root.val+l_target+r_target;
    }
}