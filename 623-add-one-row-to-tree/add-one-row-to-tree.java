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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        return add(root,val,depth,1);
    }


    public TreeNode add(TreeNode root,int val,int depth,int curr)
    {
        if(root==null) return null;

        

       

        if(curr==depth-1)
        {
           
            TreeNode left_1 = new TreeNode(val);
            TreeNode temp = root.left;
            root.left = left_1;
            left_1.left = temp;
            

            TreeNode right_1 = new TreeNode(val);
            TreeNode temp_1 = root.right;
            root.right = right_1;
            right_1.right = temp_1;
            
        }

        else{

        add(root.left,val,depth,curr+1);
        add(root.right,val,depth,curr+1);
        }

        return root;

    }
}