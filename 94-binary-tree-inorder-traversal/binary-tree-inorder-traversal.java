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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> a = new ArrayList<>();
        TreeNode proc = root;

        inorder_helper(a,root);

    return a;
        
    }

    public void inorder_helper(List<Integer> a,TreeNode proc)
    {
    if(proc==null)
    {
   
    return;
    }

    inorder_helper(a,proc.left);
    a.add(proc.val);
    inorder_helper(a,proc.right);
    }
}