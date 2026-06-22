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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            Set<Integer>  a = new HashSet<>();
            for(int i=0;i<size;i++)
            {
            TreeNode curr = q.poll();
            
            if(curr.left!=null && curr.right!=null )
            {
            if((curr.left.val == x && curr.right.val == y) || (curr.left.val == y && curr.right.val == x) )
            {
                return false;
            }
            }

            a.add(curr.val);
            if(curr.left!=null)
            {
               
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }

            }

            if(a.contains(x)&&a.contains(y))
            {
                return true;
            }

        }


        return false;
    }
}