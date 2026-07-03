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
    public boolean isEvenOddTree(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while(!q.isEmpty())
        {
            int size = q.size();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr = q.poll();
                a.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }

            if((level&1)==0)
            {
                if((a.get(0)&1)==0) return false;
                for(int i=1;i<a.size();i++)
                {
                    if(a.get(i)%2==0 || a.get(i-1)>=a.get(i)) return false;
                }
            }
            else
            {
                 if((a.get(0)&1)==1) return false;
                for(int i=1;i<a.size();i++)
                {
                    if(a.get(i)%2==1 || a.get(i-1)<=a.get(i)) return false;
                }
            }
            level++;
        }

        return true;
    }
}