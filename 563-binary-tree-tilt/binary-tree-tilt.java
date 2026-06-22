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
    public int findTilt(TreeNode root) {
        
        
        if(root==null) return 0;
        root.val = Math.abs(find(root.left)- find(root.right));
        findTilt(root.left);
        findTilt(root.right);


        return find(root);
    }


    public int find(TreeNode root)
    {
        if(root==null) return 0;


        

       

        int l_target = find(root.left);
        int r_target = find(root.right);

        return root.val+l_target+r_target;
    }
}