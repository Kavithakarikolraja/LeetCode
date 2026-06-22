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
    public boolean isUnivalTree(TreeNode root) {

        if(root==null) return true;
        
        
        Queue<TreeNode> q = new LinkedList<>();
        //HashSet<Integer> a = new HashSet<>();
        q.add(root);
        //a.add(root.val);

        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();
           
            if(curr.left!=null)
            {
                if(root.val!=curr.left.val) return false;
                 q.add(curr.left); 
            }
            if(curr.right!=null)
            {
                if(curr.right.val!=root.val) return false;
                 q.add(curr.right);
            }
        }

        

        return true;

       
    }
}
   