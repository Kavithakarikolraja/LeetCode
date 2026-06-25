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
    public List<Double> averageOfLevels(TreeNode root) {

        
        List<Double> a = new ArrayList<>();
        if(root==null) return a;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            double count = 0;
            double sum = 0;
            int size = q.size();

            for(int i=0;i<size;i++)
            {
            TreeNode curr = q.poll();
            sum += curr.val;
            count++;
            
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);

            }
            a.add(sum/count);
        }

        return a;
    }
}