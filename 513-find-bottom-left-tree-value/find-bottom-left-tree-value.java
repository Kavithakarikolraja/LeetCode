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
    int left = 0;
    int height_a = 0;
    public int findBottomLeftValue(TreeNode root) {
   /* int left = 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            ArrayList<Integer> re = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
            TreeNode curr = q.poll();
            re.add(curr.val);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
            }
            left = re.get(0);

        }

        return left;*/


        leftMost(root,0);
        return left;
    }

    public void leftMost(TreeNode root,int height)
    {
        if(root==null) return;

        height++;
        if(root.left==null && root.right==null)
        {
            if(height>height_a)
            {
                 left = root.val;
                 height_a = height;
            }
        }

        leftMost(root.left,height);
        leftMost(root.right,height);
    }
}