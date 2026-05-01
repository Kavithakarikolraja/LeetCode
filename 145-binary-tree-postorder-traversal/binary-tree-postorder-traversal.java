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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> a = new ArrayList<>();

        if(root==null) return a;
        
        
        a.addAll(postorderTraversal(root.left));
        a.addAll(postorderTraversal(root.right));
        a.add(root.val);
     return a;
    }
}