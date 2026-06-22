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
    public TreeNode increasingBST(TreeNode root) {
        
        Queue<Integer> a = new LinkedList<>();

        increment(root,a);
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root_i = new TreeNode(a.poll());
        q.add(root_i);

        while(!a.isEmpty())
        {
            TreeNode curr = q.poll();
            int val = a.poll();
            curr.right = new TreeNode(val);
            q.add(curr.right);


        }

        return root_i;
    }

    public void increment(TreeNode root, Queue<Integer> a)
    {
        if(root==null) return;

       
        increment(root.left,a);
         a.add(root.val);
        increment(root.right,a);
    }
}