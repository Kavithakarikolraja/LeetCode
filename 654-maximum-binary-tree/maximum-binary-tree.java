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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }

    public TreeNode construct(int[] arr,int left,int right)
    {
        if(left>right) return null;

        int maxIndex = left;
        
        for(int i=left+1;i<=right;i++)
        {
            if(arr[i]>arr[maxIndex])
            {
                maxIndex = i;
            }
        }

        TreeNode node = new TreeNode(arr[maxIndex]);

        node.left = construct(arr,left,maxIndex-1);
        node.right = construct(arr,maxIndex+1,right);

        return node;
    }
}