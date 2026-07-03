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
    
    public TreeNode bstFromPreorder(int[] preorder) {
        
        
        TreeNode root = null;

        for(int i=0;i<preorder.length;i++)
        {
            root = buildTree(root,preorder[i]);
        }

        return root;
    }

    public TreeNode buildTree(TreeNode root,int value)
    {
        if(root==null) return new TreeNode(value);

        if(value<root.val)
        {
            root.left = buildTree(root.left,value);
        }

         if(value>root.val)
        {
            root.right = buildTree(root.right,value);
        }

        return root;
    }

  
}