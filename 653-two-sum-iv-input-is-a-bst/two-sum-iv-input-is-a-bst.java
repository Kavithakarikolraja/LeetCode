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
    public boolean findTarget(TreeNode root, int k) {

        if(root.left==null && root.right==null) return false;
        
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
       
        for(int i=0;i<arr.size()-1;i++)
        {
            int val = k - arr.get(i);

            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(j)==val) return true;
            }
        }

        return false;
    }

    public void inorder(TreeNode root,ArrayList<Integer> a)
    {
        if(root==null) return;

        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
}