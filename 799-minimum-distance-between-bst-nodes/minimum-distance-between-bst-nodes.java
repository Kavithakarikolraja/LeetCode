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
    public int minDiffInBST(TreeNode root) {
        
       Queue<TreeNode> q = new LinkedList<>();
       List<Integer> a = new ArrayList<>();
       int min = Integer.MAX_VALUE;
       q.add(root);

       while(!q.isEmpty())
       {
        
        TreeNode curr = q.poll();
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
       
       for(int i=0;i<a.size()-1;i++)
       {
        for(int j=i+1;j<a.size();j++)
        {
            int val = Math.abs(a.get(i)-a.get(j));
            min = Math.min(min,val);
        }
       }
       return min;
    }

   
}