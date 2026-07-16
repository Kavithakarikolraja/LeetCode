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
    int max = 0;
    class info
    {
        boolean isBst;
        int minVal;
        int maxVal;
        int sum;

        info(boolean isBst,int minVal,int maxVal,int sum)
        {
            this.isBst = isBst;
            this.minVal = minVal;
            this.maxVal = maxVal;
            this.sum = sum;
        }

    }
    public int maxSumBST(TreeNode root) {
        
        traverse(root);
        return max;
    }

    public info traverse(TreeNode root)
    {
        if(root==null) return new info(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);

        info left = traverse(root.left);
        info right = traverse(root.right);

        if(left.isBst && right.isBst && root.val > left.maxVal && root.val < right.minVal)
        {
            int sum = left.sum + right.sum+root.val;
            max = Math.max(max,sum);
            int minimum = Math.min(root.val,left.minVal);
            int maximum = Math.max(root.val,right.maxVal);
            return new info(true,minimum,maximum,sum);
        }else
        {
            return new info(false,0,0,0);
        }
    }
}