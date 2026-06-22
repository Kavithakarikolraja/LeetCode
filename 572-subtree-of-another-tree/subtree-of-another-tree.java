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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

    
    

       Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();
            if(isSame(curr,subRoot))
            {
                return true;
            }

            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }

        return false;
    }


    public boolean isSame(TreeNode t,TreeNode s)
    {
        if(t==null && s==null) return true;

        if(t.left!=null && s.left==null || t.left==null && s.left!=null || t.right!=null && s.right==null || t.right==null && s.right!=null ||  t.val!=s.val)
        {
            return false;
        }

        

        return isSame(t.left,s.left) && isSame(t.right,s.right);
    }
}