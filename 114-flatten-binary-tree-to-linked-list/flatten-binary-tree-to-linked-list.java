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
    public void flatten(TreeNode root) {
        
        if(root==null) return;

        Queue<Integer> a = new LinkedList<>();
        flatten_tree(root,a);
       
        TreeNode curr = root;
        curr.val = a.poll();

        while (!a.isEmpty()) {
            curr.left = null; 
            curr.right = new TreeNode(a.poll());
            curr = curr.right;
        }
    }

    public static void flatten_tree(TreeNode root,Queue<Integer> a)
    {
        if(root==null) return;

        a.add(root.val);
        flatten_tree(root.left,a);
        flatten_tree(root.right,a);
    }
}