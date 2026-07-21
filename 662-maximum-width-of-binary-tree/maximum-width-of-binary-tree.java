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
    int width = 1;
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q  = new LinkedList<>();
        Queue<Integer> index = new LinkedList<>();
        q.add(root);
        index.add(1);

        while(!q.isEmpty())
        {
            int size = q.size();
            int leftIndex = 0;
            int rightIndex = 0;

            for(int i=0;i<size;i++)
            {
                TreeNode curr = q.poll();
                int pos = index.poll();


                if(i==0) leftIndex = pos;
                if(i==size-1) rightIndex = pos;

                if(curr.left!=null)
                {
                    q.add(curr.left);
                    index.add(pos*2);
                }

                if(curr.right!=null)
                {
                    q.add(curr.right);
                    index.add(pos*2+1);
                }
            }

            width = Math.max(width,(rightIndex-leftIndex)+1);
        }

        return width;
    }
}